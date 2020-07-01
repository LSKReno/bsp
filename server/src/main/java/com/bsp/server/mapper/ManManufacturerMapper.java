package com.bsp.server.mapper;

import com.bsp.server.domain.ManManufacturer;
import com.bsp.server.domain.ManManufacturerExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManManufacturerMapper {
    long countByExample(ManManufacturerExample example);

    int deleteByExample(ManManufacturerExample example);

    int deleteByPrimaryKey(Integer manId);

    int insert(ManManufacturer record);

    int insertSelective(ManManufacturer record);

    ManManufacturer selectOneByExample(ManManufacturerExample example);

    ManManufacturer selectOneByExampleSelective(@Param("example") ManManufacturerExample example, @Param("selective") ManManufacturer.Column ... selective);

    ManManufacturer selectOneByExampleWithBLOBs(ManManufacturerExample example);

    List<ManManufacturer> selectByExampleSelective(@Param("example") ManManufacturerExample example, @Param("selective") ManManufacturer.Column ... selective);

    List<ManManufacturer> selectByExampleWithBLOBs(ManManufacturerExample example);

    List<ManManufacturer> selectByExample(ManManufacturerExample example);

    ManManufacturer selectByPrimaryKeySelective(@Param("manId") Integer manId, @Param("selective") ManManufacturer.Column ... selective);

    ManManufacturer selectByPrimaryKey(Integer manId);

    int updateByExampleSelective(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExampleWithBLOBs(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExample(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByPrimaryKeySelective(ManManufacturer record);

    int updateByPrimaryKeyWithBLOBs(ManManufacturer record);

    int updateByPrimaryKey(ManManufacturer record);
}