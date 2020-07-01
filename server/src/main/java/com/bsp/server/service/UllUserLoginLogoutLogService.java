package com.bsp.server.service;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.UllUserLoginLogoutLogDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.UllUserLoginLogoutLog;
import com.bsp.server.domain.UllUserLoginLogoutLogExample;
import com.bsp.server.mapper.UllUserLoginLogoutLogMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;

@Service
public class UllUserLoginLogoutLogService {

    @Resource
    private UllUserLoginLogoutLogMapper ullUserLoginLogoutLogMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        UllUserLoginLogoutLogExample ullUserLoginLogoutLogExample = new UllUserLoginLogoutLogExample();
        List<UllUserLoginLogoutLog> ullUserLoginLogoutLogList = ullUserLoginLogoutLogMapper.selectByExample(ullUserLoginLogoutLogExample);
        PageInfo<UllUserLoginLogoutLog> pageInfo = new PageInfo<>(ullUserLoginLogoutLogList);
        pageDto.setTotal(pageInfo.getTotal());
        List<UllUserLoginLogoutLogDto> ullUserLoginLogoutLogDtoList = CopyUtil.copyList(ullUserLoginLogoutLogList, UllUserLoginLogoutLogDto.class);
        pageDto.setList(ullUserLoginLogoutLogDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(UllUserLoginLogoutLogDto ullUserLoginLogoutLogDto) {
        UllUserLoginLogoutLog ullUserLoginLogoutLog = CopyUtil.copy(ullUserLoginLogoutLogDto, UllUserLoginLogoutLog.class);
        if (StringUtils.isEmpty(ullUserLoginLogoutLogDto.getUllId())) {
            this.insert(ullUserLoginLogoutLog);
        } else {
            this.update(ullUserLoginLogoutLog);
        }
    }

    /**
     * 新增
     */
    private void insert(UllUserLoginLogoutLog ullUserLoginLogoutLog) {
        Date now = new Date();
        ullUserLoginLogoutLogMapper.insert(ullUserLoginLogoutLog);
    }

    /**
     * 更新
     */
    private void update(UllUserLoginLogoutLog ullUserLoginLogoutLog) {
        ullUserLoginLogoutLogMapper.updateByPrimaryKey(ullUserLoginLogoutLog);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        ullUserLoginLogoutLogMapper.deleteByPrimaryKey(id);
    }
}
