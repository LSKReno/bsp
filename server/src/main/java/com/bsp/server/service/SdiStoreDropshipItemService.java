package com.bsp.server.service;

import com.bsp.server.domain.SdiStoreDropshipItem;
import com.bsp.server.domain.SdiStoreDropshipItemExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SdiStoreDropshipItemDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.SdiStoreDropshipItemMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SdiStoreDropshipItemService {

    @Resource
    private SdiStoreDropshipItemMapper sdiStoreDropshipItemMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SdiStoreDropshipItemExample sdiStoreDropshipItemExample = new SdiStoreDropshipItemExample();
        List<SdiStoreDropshipItem> sdiStoreDropshipItemList = sdiStoreDropshipItemMapper.selectByExample(sdiStoreDropshipItemExample);
        PageInfo<SdiStoreDropshipItem> pageInfo = new PageInfo<>(sdiStoreDropshipItemList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SdiStoreDropshipItemDto> sdiStoreDropshipItemDtoList = CopyUtil.copyList(sdiStoreDropshipItemList, SdiStoreDropshipItemDto.class);
        pageDto.setList(sdiStoreDropshipItemDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SdiStoreDropshipItemDto sdiStoreDropshipItemDto) {
        SdiStoreDropshipItem sdiStoreDropshipItem = CopyUtil.copy(sdiStoreDropshipItemDto, SdiStoreDropshipItem.class);
        if (StringUtils.isEmpty(sdiStoreDropshipItemDto.getDilId())) {
            this.insert(sdiStoreDropshipItem);
        } else {
            this.update(sdiStoreDropshipItem);
        }
    }

    /**
     * 新增
     */
    private void insert(SdiStoreDropshipItem sdiStoreDropshipItem) {
        sdiStoreDropshipItemMapper.insert(sdiStoreDropshipItem);
    }

    public int insertSelective(Map<String,Object> mp) {
        return sdiStoreDropshipItemMapper.insertSelective(mp);
    }

    /**
     * 更新
     */
    private void update(SdiStoreDropshipItem sdiStoreDropshipItem) {
        sdiStoreDropshipItemMapper.updateByPrimaryKey(sdiStoreDropshipItem);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sdiStoreDropshipItemMapper.deleteByPrimaryKey(id);
    }
}
