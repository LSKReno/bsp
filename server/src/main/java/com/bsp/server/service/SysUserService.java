package com.bsp.server.service;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.exception.BusinessException;
import com.bsp.server.exception.BusinessExceptionCode;
import com.bsp.server.mapper.SysUserMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SysUserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserService {
    private static final Logger LOG = LoggerFactory.getLogger(SysUserService.class);

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysUserExample sysUserExample = new SysUserExample();
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUserList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysUserDto> sysUserDtoList = CopyUtil.copyList(sysUserList, SysUserDto.class);
        pageDto.setList(sysUserDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SysUserDto sysUserDto) {
        SysUser sysUser = CopyUtil.copy(sysUserDto, SysUser.class);
        if (StringUtils.isEmpty(sysUserDto.getUserId())) {
            this.insert(sysUser);
        } else {
            this.update(sysUser);
        }
    }

    /**
     * 新增
     */
    private void insert(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    /**
     * 更新
     */
    private void update(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKey(sysUser);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }


    /**
     * 根据登录名查询用户信息
     *
     * @param userName
     * @return
     */
    public SysUser selectByUserName(String userName) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUsernameEqualTo(userName);
        List<SysUser> userList = sysUserMapper.selectByExample(sysUserExample);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        } else {
            return userList.get(0);
        }
    }

    /**
     * 登录
     *
     * @param sysUserDto
     */
    public SysUserDto login(SysUserDto sysUserDto) {
        // 查询该用户名是否存在
        SysUser user = selectByUserName(sysUserDto.getUsername());
        if (user == null) {
            LOG.info("用户名不存在, {}", sysUserDto.getUsername());
            throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
        } else {
            // 检查密码是否正确
            if (user.getPassword().equals(sysUserDto.getPassword())) {
                // 登录成功
                SysUserDto loginUserDto = CopyUtil.copy(user, SysUserDto.class);

                return loginUserDto;
            } else {
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", sysUserDto.getPassword(), user.getPassword());
                throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
            }
        }
    }
}
