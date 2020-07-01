package com.bsp.server.mapper;

import com.bsp.server.domain.CdmCodeMaster;
import com.bsp.server.domain.CdmCodeMasterExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CdmCodeMasterMapper {
    long countByExample(CdmCodeMasterExample example);

    int deleteByExample(CdmCodeMasterExample example);

    int deleteByPrimaryKey(Integer cdmId);

    int insert(CdmCodeMaster record);

    int insertSelective(CdmCodeMaster record);

    CdmCodeMaster selectOneByExample(CdmCodeMasterExample example);

    CdmCodeMaster selectOneByExampleSelective(@Param("example") CdmCodeMasterExample example, @Param("selective") CdmCodeMaster.Column ... selective);

    List<CdmCodeMaster> selectByExampleSelective(@Param("example") CdmCodeMasterExample example, @Param("selective") CdmCodeMaster.Column ... selective);

    List<CdmCodeMaster> selectByExample(CdmCodeMasterExample example);

    CdmCodeMaster selectByPrimaryKeySelective(@Param("cdmId") Integer cdmId, @Param("selective") CdmCodeMaster.Column ... selective);

    CdmCodeMaster selectByPrimaryKey(Integer cdmId);

    int updateByExampleSelective(@Param("record") CdmCodeMaster record, @Param("example") CdmCodeMasterExample example);

    int updateByExample(@Param("record") CdmCodeMaster record, @Param("example") CdmCodeMasterExample example);

    int updateByPrimaryKeySelective(CdmCodeMaster record);

    int updateByPrimaryKey(CdmCodeMaster record);
}