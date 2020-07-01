package com.bsp.server.service;

import com.bsp.server.domain.SolStoreOrderLineItemExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SolStoreOrderLineItemDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SolStoreOrderLineItem;
import com.bsp.server.mapper.SolStoreOrderLineItemMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SolStoreOrderLineItemService {

    @Resource
    private SolStoreOrderLineItemMapper solStoreOrderLineItemMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SolStoreOrderLineItemExample solStoreOrderLineItemExample = new SolStoreOrderLineItemExample();
        List<SolStoreOrderLineItem> solStoreOrderLineItemList = solStoreOrderLineItemMapper.selectByExample(solStoreOrderLineItemExample);
        PageInfo<SolStoreOrderLineItem> pageInfo = new PageInfo<>(solStoreOrderLineItemList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SolStoreOrderLineItemDto> solStoreOrderLineItemDtoList = CopyUtil.copyList(solStoreOrderLineItemList, SolStoreOrderLineItemDto.class);
        pageDto.setList(solStoreOrderLineItemDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SolStoreOrderLineItemDto solStoreOrderLineItemDto) {
        SolStoreOrderLineItem solStoreOrderLineItem = CopyUtil.copy(solStoreOrderLineItemDto, SolStoreOrderLineItem.class);
        if (StringUtils.isEmpty(solStoreOrderLineItemDto.getSolId())) {
            this.insert(solStoreOrderLineItem);
        } else {
            this.update(solStoreOrderLineItem);
        }
    }

    /**
     * 新增
     */
    private void insert(SolStoreOrderLineItem solStoreOrderLineItem) {
        solStoreOrderLineItemMapper.insert(solStoreOrderLineItem);
    }

    /**
     * 更新
     */
    private void update(SolStoreOrderLineItem solStoreOrderLineItem) {
        solStoreOrderLineItemMapper.updateByPrimaryKey(solStoreOrderLineItem);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        solStoreOrderLineItemMapper.deleteByPrimaryKey(id);
    }
}
