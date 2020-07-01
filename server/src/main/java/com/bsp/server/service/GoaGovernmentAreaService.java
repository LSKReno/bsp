package com.bsp.server.service;

import com.bsp.server.domain.GoaGovernmentAreaExample;
import com.bsp.server.dto.GoaGovernmentAreaDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.GoaGovernmentArea;
import com.bsp.server.mapper.GoaGovernmentAreaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoaGovernmentAreaService {

    @Resource
    private GoaGovernmentAreaMapper goaGovernmentAreaMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        GoaGovernmentAreaExample goaGovernmentAreaExample = new GoaGovernmentAreaExample();
        List<GoaGovernmentArea> goaGovernmentAreaList = goaGovernmentAreaMapper.selectByExample(goaGovernmentAreaExample);
        PageInfo<GoaGovernmentArea> pageInfo = new PageInfo<>(goaGovernmentAreaList);
        pageDto.setTotal(pageInfo.getTotal());
        List<GoaGovernmentAreaDto> goaGovernmentAreaDtoList = CopyUtil.copyList(goaGovernmentAreaList, GoaGovernmentAreaDto.class);
        pageDto.setList(goaGovernmentAreaDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(GoaGovernmentAreaDto goaGovernmentAreaDto) {
        GoaGovernmentArea goaGovernmentArea = CopyUtil.copy(goaGovernmentAreaDto, GoaGovernmentArea.class);
        if (StringUtils.isEmpty(goaGovernmentAreaDto.getGoaId())) {
            this.insert(goaGovernmentArea);
        } else {
            this.update(goaGovernmentArea);
        }
    }

    /**
     * 新增
     */
    private void insert(GoaGovernmentArea goaGovernmentArea) {
        goaGovernmentAreaMapper.insert(goaGovernmentArea);
    }

    /**
     * 更新
     */
    private void update(GoaGovernmentArea goaGovernmentArea) {
        goaGovernmentAreaMapper.updateByPrimaryKey(goaGovernmentArea);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        goaGovernmentAreaMapper.deleteByPrimaryKey(id);
    }
}
