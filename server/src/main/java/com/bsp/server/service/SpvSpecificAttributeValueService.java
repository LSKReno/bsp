package com.bsp.server.service;

import com.bsp.server.domain.SpvSpecificAttributeValueExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SpvSpecificAttributeValueDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SpvSpecificAttributeValue;
import com.bsp.server.mapper.SpvSpecificAttributeValueMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpvSpecificAttributeValueService {

    @Resource
    private SpvSpecificAttributeValueMapper spvSpecificAttributeValueMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SpvSpecificAttributeValueExample spvSpecificAttributeValueExample = new SpvSpecificAttributeValueExample();
        List<SpvSpecificAttributeValue> spvSpecificAttributeValueList = spvSpecificAttributeValueMapper.selectByExample(spvSpecificAttributeValueExample);
        PageInfo<SpvSpecificAttributeValue> pageInfo = new PageInfo<>(spvSpecificAttributeValueList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SpvSpecificAttributeValueDto> spvSpecificAttributeValueDtoList = CopyUtil.copyList(spvSpecificAttributeValueList, SpvSpecificAttributeValueDto.class);
        pageDto.setList(spvSpecificAttributeValueDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SpvSpecificAttributeValueDto spvSpecificAttributeValueDto) {
        SpvSpecificAttributeValue spvSpecificAttributeValue = CopyUtil.copy(spvSpecificAttributeValueDto, SpvSpecificAttributeValue.class);
        if (StringUtils.isEmpty(spvSpecificAttributeValueDto.getSpvId())) {
            this.insert(spvSpecificAttributeValue);
        } else {
            this.update(spvSpecificAttributeValue);
        }
    }

    /**
     * 新增
     */
    private void insert(SpvSpecificAttributeValue spvSpecificAttributeValue) {
        spvSpecificAttributeValueMapper.insert(spvSpecificAttributeValue);
    }

    /**
     * 更新
     */
    private void update(SpvSpecificAttributeValue spvSpecificAttributeValue) {
        spvSpecificAttributeValueMapper.updateByPrimaryKey(spvSpecificAttributeValue);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        spvSpecificAttributeValueMapper.deleteByPrimaryKey(id);
    }
}
