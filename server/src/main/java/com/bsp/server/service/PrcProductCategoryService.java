package com.bsp.server.service;

import com.bsp.server.domain.PrcProductCategory;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.PrcProductCategoryDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.PrcProductCategoryExample;
import com.bsp.server.mapper.PrcProductCategoryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PrcProductCategoryService {

    @Resource
    private PrcProductCategoryMapper prcProductCategoryMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        PrcProductCategoryExample prcProductCategoryExample = new PrcProductCategoryExample();
        List<PrcProductCategory> prcProductCategoryList = prcProductCategoryMapper.selectByExample(prcProductCategoryExample);
        PageInfo<PrcProductCategory> pageInfo = new PageInfo<>(prcProductCategoryList);
        pageDto.setTotal(pageInfo.getTotal());
        List<PrcProductCategoryDto> prcProductCategoryDtoList = CopyUtil.copyList(prcProductCategoryList, PrcProductCategoryDto.class);
        pageDto.setList(prcProductCategoryDtoList);
    }
    /**
     * 列表查询，根据man_id, (title)
     */
    public void list(PageDto pageDto, Map<String,Object> mp) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        List<Map<String,Object>> prcProductCategoryList=prcProductCategoryMapper.list(mp);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(prcProductCategoryList);
        pageDto.setTotal(pageInfo.getTotal());
        pageDto.setList(prcProductCategoryList);

    }


    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(PrcProductCategoryDto prcProductCategoryDto) {
        PrcProductCategory prcProductCategory = CopyUtil.copy(prcProductCategoryDto, PrcProductCategory.class);
        if (StringUtils.isEmpty(prcProductCategoryDto.getPrcId())) {
            this.insert(prcProductCategory);
        } else {
            this.update(prcProductCategory);
        }
    }

    /**
     * 新增
     */
    private void insert(PrcProductCategory prcProductCategory) {
        prcProductCategoryMapper.insert(prcProductCategory);
    }

    public int insertSelective(Map<String,Object> mp) {
        return prcProductCategoryMapper.insertSelective(mp);
    }

    /**
     * 更新
     */
    private void update(PrcProductCategory prcProductCategory) {
        prcProductCategoryMapper.updateByPrimaryKey(prcProductCategory);
    }

    public int updateByPrimaryKeySelective(Map<String,Object> mp) {
        return prcProductCategoryMapper.updateByPrimaryKeySelective(mp);
    }

    public int updateSelective(Map<String,Object> mp) {
        return prcProductCategoryMapper.updateSelective(mp);
    }
    /**
     * 删除
     */
    public void delete(Integer id) {
        prcProductCategoryMapper.deleteByPrimaryKey(id);
    }
}
