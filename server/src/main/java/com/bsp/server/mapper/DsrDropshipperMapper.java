package com.bsp.server.mapper;

import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.domain.DsrDropshipperExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsrDropshipperMapper {
    long countByExample(DsrDropshipperExample example);

    int deleteByExample(DsrDropshipperExample example);

    int deleteByPrimaryKey(Integer dsrId);

    int insert(DsrDropshipper record);

    int insertSelective(DsrDropshipper record);

    DsrDropshipper selectOneByExample(DsrDropshipperExample example);

    DsrDropshipper selectOneByExampleSelective(@Param("example") DsrDropshipperExample example, @Param("selective") DsrDropshipper.Column ... selective);

    List<DsrDropshipper> selectByExampleSelective(@Param("example") DsrDropshipperExample example, @Param("selective") DsrDropshipper.Column ... selective);

    List<DsrDropshipper> selectByExample(DsrDropshipperExample example);

    DsrDropshipper selectByPrimaryKeySelective(@Param("dsrId") Integer dsrId, @Param("selective") DsrDropshipper.Column ... selective);

    DsrDropshipper selectByPrimaryKey(Integer dsrId);

    int updateByExampleSelective(@Param("record") DsrDropshipper record, @Param("example") DsrDropshipperExample example);

    int updateByExample(@Param("record") DsrDropshipper record, @Param("example") DsrDropshipperExample example);

    int updateByPrimaryKeySelective(DsrDropshipper record);

    int updateByPrimaryKey(DsrDropshipper record);
}