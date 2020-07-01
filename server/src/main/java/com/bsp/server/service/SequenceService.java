package com.bsp.server.service;

import com.bsp.server.domain.Sequence;
import com.bsp.server.domain.SequenceExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SequenceDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.SequenceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SequenceService {

    @Resource
    private SequenceMapper sequenceMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SequenceExample sequenceExample = new SequenceExample();
        List<Sequence> sequenceList = sequenceMapper.selectByExample(sequenceExample);
        PageInfo<Sequence> pageInfo = new PageInfo<>(sequenceList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SequenceDto> sequenceDtoList = CopyUtil.copyList(sequenceList, SequenceDto.class);
        pageDto.setList(sequenceDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SequenceDto sequenceDto) {
        Sequence sequence = CopyUtil.copy(sequenceDto, Sequence.class);
        if (StringUtils.isEmpty(sequenceDto.getId())) {
            this.insert(sequence);
        } else {
            this.update(sequence);
        }
    }

    /**
     * 新增
     */
    private void insert(Sequence sequence) {
        sequenceMapper.insert(sequence);
    }

    /**
     * 更新
     */
    private void update(Sequence sequence) {
        sequenceMapper.updateByPrimaryKey(sequence);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sequenceMapper.deleteByPrimaryKey(id);
    }
}
