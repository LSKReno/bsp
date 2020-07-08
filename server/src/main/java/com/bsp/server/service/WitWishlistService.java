package com.bsp.server.service;

import com.bsp.server.domain.WitWishlist;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.WitWishlistDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.WitWishlistExample;
import com.bsp.server.mapper.WitWishlistMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WitWishlistService {

    @Resource
    private WitWishlistMapper witWishlistMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WitWishlistExample witWishlistExample = new WitWishlistExample();
        List<WitWishlist> witWishlistList = witWishlistMapper.selectByExample(witWishlistExample);
        PageInfo<WitWishlist> pageInfo = new PageInfo<>(witWishlistList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WitWishlistDto> witWishlistDtoList = CopyUtil.copyList(witWishlistList, WitWishlistDto.class);
        pageDto.setList(witWishlistDtoList);
    }


    public void list(PageDto pageDto, int dsrId) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WitWishlistExample witWishlistExample = new WitWishlistExample();
        WitWishlistExample.Criteria criteria= witWishlistExample.createCriteria();
        criteria.andDeletedEqualTo(false);
        criteria.andDsrIdEqualTo(dsrId);
        List<WitWishlist> witWishlistList = witWishlistMapper.selectByExample(witWishlistExample);
        PageInfo<WitWishlist> pageInfo = new PageInfo<>(witWishlistList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WitWishlistDto> witWishlistDtoList = CopyUtil.copyList(witWishlistList, WitWishlistDto.class);
        pageDto.setList(witWishlistDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(WitWishlistDto witWishlistDto) {
        WitWishlist witWishlist = CopyUtil.copy(witWishlistDto, WitWishlist.class);
        if (StringUtils.isEmpty(witWishlistDto.getWitId())) {
            this.insert(witWishlist);
        } else {
            this.update(witWishlist);
        }
    }

    /**
     * 新增
     */
    private void insert(WitWishlist witWishlist) {
        witWishlistMapper.insert(witWishlist);
    }

    public int insertSelective(WitWishlist witWishlist) {
        return witWishlistMapper.insertSelective(witWishlist);
    }
    /**
     * 更新
     */
    private void update(WitWishlist witWishlist) {
        witWishlistMapper.updateByPrimaryKey(witWishlist);
    }
    public int updateByPrimaryKeySelective(WitWishlist witWishlist) {
        return witWishlistMapper.updateByPrimaryKeySelective(witWishlist);
    }
    /**
     * 删除
     */
    public void delete(Integer id) {
        witWishlistMapper.deleteByPrimaryKey(id);
    }
}
