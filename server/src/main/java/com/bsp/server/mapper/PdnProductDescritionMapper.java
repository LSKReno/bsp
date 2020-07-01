package com.bsp.server.mapper;

import com.bsp.server.domain.PdnProductDescrition;
import com.bsp.server.domain.PdnProductDescritionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdnProductDescritionMapper {
    long countByExample(PdnProductDescritionExample example);

    int deleteByExample(PdnProductDescritionExample example);

    int deleteByPrimaryKey(Integer pdnId);

    int insert(PdnProductDescrition record);

    int insertSelective(PdnProductDescrition record);

    PdnProductDescrition selectOneByExample(PdnProductDescritionExample example);

    PdnProductDescrition selectOneByExampleSelective(@Param("example") PdnProductDescritionExample example, @Param("selective") PdnProductDescrition.Column ... selective);

    PdnProductDescrition selectOneByExampleWithBLOBs(PdnProductDescritionExample example);

    List<PdnProductDescrition> selectByExampleSelective(@Param("example") PdnProductDescritionExample example, @Param("selective") PdnProductDescrition.Column ... selective);

    List<PdnProductDescrition> selectByExampleWithBLOBs(PdnProductDescritionExample example);

    List<PdnProductDescrition> selectByExample(PdnProductDescritionExample example);

    PdnProductDescrition selectByPrimaryKeySelective(@Param("pdnId") Integer pdnId, @Param("selective") PdnProductDescrition.Column ... selective);

    PdnProductDescrition selectByPrimaryKey(Integer pdnId);

    int updateByExampleSelective(@Param("record") PdnProductDescrition record, @Param("example") PdnProductDescritionExample example);

    int updateByExampleWithBLOBs(@Param("record") PdnProductDescrition record, @Param("example") PdnProductDescritionExample example);

    int updateByExample(@Param("record") PdnProductDescrition record, @Param("example") PdnProductDescritionExample example);

    int updateByPrimaryKeySelective(PdnProductDescrition record);

    int updateByPrimaryKeyWithBLOBs(PdnProductDescrition record);

    int updateByPrimaryKey(PdnProductDescrition record);
}