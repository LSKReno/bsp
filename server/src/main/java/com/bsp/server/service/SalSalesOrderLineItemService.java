package com.bsp.server.service;

import com.bsp.server.domain.SalSalesOrderLineItem;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SalSalesOrderLineItemDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SalSalesOrderLineItemExample;
import com.bsp.server.mapper.SalSalesOrderLineItemMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalSalesOrderLineItemService {

    @Resource
    private SalSalesOrderLineItemMapper salSalesOrderLineItemMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SalSalesOrderLineItemExample salSalesOrderLineItemExample = new SalSalesOrderLineItemExample();
        List<SalSalesOrderLineItem> salSalesOrderLineItemList = salSalesOrderLineItemMapper.selectByExample(salSalesOrderLineItemExample);
        PageInfo<SalSalesOrderLineItem> pageInfo = new PageInfo<>(salSalesOrderLineItemList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SalSalesOrderLineItemDto> salSalesOrderLineItemDtoList = CopyUtil.copyList(salSalesOrderLineItemList, SalSalesOrderLineItemDto.class);
        pageDto.setList(salSalesOrderLineItemDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(SalSalesOrderLineItemDto salSalesOrderLineItemDto) {
        SalSalesOrderLineItem salSalesOrderLineItem = CopyUtil.copy(salSalesOrderLineItemDto, SalSalesOrderLineItem.class);
        if (StringUtils.isEmpty(salSalesOrderLineItemDto.getSalId())) {
            this.insert(salSalesOrderLineItem);
        } else {
            this.update(salSalesOrderLineItem);
        }
        return salSalesOrderLineItem.getSalId();
    }

    /**
     * 新增
     */
    private void insert(SalSalesOrderLineItem salSalesOrderLineItem) {
        salSalesOrderLineItemMapper.insert(salSalesOrderLineItem);
    }

    /**
     * 更新
     */
    private void update(SalSalesOrderLineItem salSalesOrderLineItem) {
        salSalesOrderLineItemMapper.updateByPrimaryKey(salSalesOrderLineItem);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        salSalesOrderLineItemMapper.deleteByPrimaryKey(id);
    }

    public List<SalSalesOrderLineItemDto> selectBySaoId(Integer saoId) {
        List<SalSalesOrderLineItem> salSalesOrderLineItems = salSalesOrderLineItemMapper.selectBySaoId(saoId);
        List<SalSalesOrderLineItemDto> salSalesOrderLineItemDtos = CopyUtil.copyList(salSalesOrderLineItems, SalSalesOrderLineItemDto.class);
        return salSalesOrderLineItemDtos;
    }
}
