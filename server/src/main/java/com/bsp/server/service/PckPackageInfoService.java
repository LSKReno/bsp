package com.bsp.server.service;

import com.bsp.server.domain.PckPackageInfo;
import com.bsp.server.domain.PckPackageInfoExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.PckPackageInfoDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.PckPackageInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PckPackageInfoService {

    @Resource
    private PckPackageInfoMapper pckPackageInfoMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        PckPackageInfoExample pckPackageInfoExample = new PckPackageInfoExample();
        List<PckPackageInfo> pckPackageInfoList = pckPackageInfoMapper.selectByExample(pckPackageInfoExample);
        PageInfo<PckPackageInfo> pageInfo = new PageInfo<>(pckPackageInfoList);
        pageDto.setTotal(pageInfo.getTotal());
        List<PckPackageInfoDto> pckPackageInfoDtoList = CopyUtil.copyList(pckPackageInfoList, PckPackageInfoDto.class);
        pageDto.setList(pckPackageInfoDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(PckPackageInfoDto pckPackageInfoDto) {
        PckPackageInfo pckPackageInfo = CopyUtil.copy(pckPackageInfoDto, PckPackageInfo.class);
        if (StringUtils.isEmpty(pckPackageInfoDto.getPckId())) {
            this.insert(pckPackageInfo);
        } else {
            this.update(pckPackageInfo);
        }
    }

    /**
     * 新增
     */
    private void insert(PckPackageInfo pckPackageInfo) {
        pckPackageInfoMapper.insert(pckPackageInfo);
    }

    public int insertSelective(Map<String,Object> mp) {
        return pckPackageInfoMapper.insertSelective(mp);
    }

    /**
     * 更新
     */
    private void update(PckPackageInfo pckPackageInfo) {
        pckPackageInfoMapper.updateByPrimaryKey(pckPackageInfo);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        pckPackageInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateSelective(Map<String,Object> mp) {
        return pckPackageInfoMapper.updateSelective(mp);
    }

}
