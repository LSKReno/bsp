package com.bsp.server.service;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.StrStoreDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.StrStore;
import com.bsp.server.domain.StrStoreExample;
import com.bsp.server.mapper.StrStoreMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class StrStoreService {

    @Resource
    private StrStoreMapper strStoreMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        StrStoreExample strStoreExample = new StrStoreExample();
        List<StrStore> strStoreList = strStoreMapper.selectByExample(strStoreExample);
        PageInfo<StrStore> pageInfo = new PageInfo<>(strStoreList);
        pageDto.setTotal(pageInfo.getTotal());
        List<StrStoreDto> strStoreDtoList = CopyUtil.copyList(strStoreList, StrStoreDto.class);
        pageDto.setList(strStoreDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(StrStoreDto strStoreDto) {
        StrStore strStore = CopyUtil.copy(strStoreDto, StrStore.class);
        strStore.setLastUpdateDate(new Date());
        if (StringUtils.isEmpty(strStoreDto.getStrId())) {
            strStore.setCreationDate(new Date());
            this.insert(strStore);
        } else {
            this.update(strStore);
        }
        return strStore.getStrId();
    }

    /**
     * select by id
     */
    public List<StrStoreDto> selectByDSRId(Integer dsrId) {
        List<StrStore> strStoreList = strStoreMapper.selectByDSRId(dsrId);
        List<StrStoreDto> strStoreDtoList = CopyUtil.copyList(strStoreList, StrStoreDto.class);
        return strStoreDtoList;
    }
    /**
     * 新增
     */
    private int insert(StrStore strStore) {
        return strStoreMapper.insert(strStore);
    }

    /**
     * 更新
     */
    private int update(StrStore strStore) {
        return strStoreMapper.updateByPrimaryKey(strStore);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        strStoreMapper.deleteByPrimaryKey(id);
    }

}
