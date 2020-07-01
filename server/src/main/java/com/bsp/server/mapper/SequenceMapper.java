package com.bsp.server.mapper;

import com.bsp.server.domain.Sequence;
import com.bsp.server.domain.SequenceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    long countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    Sequence selectOneByExample(SequenceExample example);

    Sequence selectOneByExampleSelective(@Param("example") SequenceExample example, @Param("selective") Sequence.Column ... selective);

    List<Sequence> selectByExampleSelective(@Param("example") SequenceExample example, @Param("selective") Sequence.Column ... selective);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Sequence.Column ... selective);

    Sequence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}