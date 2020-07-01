package com.bsp.server.service;

import com.bsp.server.domain.SpaSpecificAttribute;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SpaSpecificAttributeDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SpaSpecificAttributeExample;
import com.bsp.server.mapper.SpaSpecificAttributeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpaSpecificAttributeService {

    @Resource
    private SpaSpecificAttributeMapper spaSpecificAttributeMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SpaSpecificAttributeExample spaSpecificAttributeExample = new SpaSpecificAttributeExample();
        List<SpaSpecificAttribute> spaSpecificAttributeList = spaSpecificAttributeMapper.selectByExample(spaSpecificAttributeExample);
        PageInfo<SpaSpecificAttribute> pageInfo = new PageInfo<>(spaSpecificAttributeList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SpaSpecificAttributeDto> spaSpecificAttributeDtoList = CopyUtil.copyList(spaSpecificAttributeList, SpaSpecificAttributeDto.class);
        pageDto.setList(spaSpecificAttributeDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SpaSpecificAttributeDto spaSpecificAttributeDto) {
        SpaSpecificAttribute spaSpecificAttribute = CopyUtil.copy(spaSpecificAttributeDto, SpaSpecificAttribute.class);
        if (StringUtils.isEmpty(spaSpecificAttributeDto.getSpaId())) {
            this.insert(spaSpecificAttribute);
        } else {
            this.update(spaSpecificAttribute);
        }
    }

    /**
     * 新增
     */
    private void insert(SpaSpecificAttribute spaSpecificAttribute) {
        spaSpecificAttributeMapper.insert(spaSpecificAttribute);
    }

    /**
     * 更新
     */
    private void update(SpaSpecificAttribute spaSpecificAttribute) {
        spaSpecificAttributeMapper.updateByPrimaryKey(spaSpecificAttribute);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        spaSpecificAttributeMapper.deleteByPrimaryKey(id);
    }
}
