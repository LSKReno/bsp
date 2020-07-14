package com.bsp.server.service;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.ParParameter;
import com.bsp.server.domain.ParParameterExample;
import com.bsp.server.mapper.ParParameterMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParParameterService {

    @Resource
    private ParParameterMapper parParameterMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        ParParameterExample parParameterExample = new ParParameterExample();
        List<ParParameter> parParameterList = parParameterMapper.selectByExample(parParameterExample);
        PageInfo<ParParameter> pageInfo = new PageInfo<>(parParameterList);
        pageDto.setTotal(pageInfo.getTotal());
        List<ParParameterDto> parParameterDtoList = CopyUtil.copyList(parParameterList, ParParameterDto.class);
        pageDto.setList(parParameterDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(ParParameterDto parParameterDto) {
        ParParameter parParameter = CopyUtil.copy(parParameterDto, ParParameter.class);
        if (StringUtils.isEmpty(parParameterDto.getParId())) {
            this.insert(parParameter);
        } else {
            this.update(parParameter);
        }
        return parParameter.getParId();
    }

    /**
     * 新增
     */
    private void insert(ParParameter parParameter) {
        parParameterMapper.insert(parParameter);
    }

    /**
     * 更新
     */
    private void update(ParParameter parParameter) {
        parParameterMapper.updateByPrimaryKey(parParameter);
    }

    /**
     * 删除
     */
    public int delete(Integer id) {
        return parParameterMapper.deleteByPrimaryKey(id);
    }

    public List<ParParameterDto> selectAll() {
        return CopyUtil.copyList(parParameterMapper.selectAll(), ParParameterDto.class);
    }
}
