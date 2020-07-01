package com.bsp.server.mapper;

import com.bsp.server.domain.SpvSpecificAttributeValue;
import com.bsp.server.domain.SpvSpecificAttributeValueExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpvSpecificAttributeValueMapper {
    long countByExample(SpvSpecificAttributeValueExample example);

    int deleteByExample(SpvSpecificAttributeValueExample example);

    int deleteByPrimaryKey(Integer spvId);

    int insert(SpvSpecificAttributeValue record);

    int insertSelective(SpvSpecificAttributeValue record);

    SpvSpecificAttributeValue selectOneByExample(SpvSpecificAttributeValueExample example);

    SpvSpecificAttributeValue selectOneByExampleSelective(@Param("example") SpvSpecificAttributeValueExample example, @Param("selective") SpvSpecificAttributeValue.Column ... selective);

    List<SpvSpecificAttributeValue> selectByExampleSelective(@Param("example") SpvSpecificAttributeValueExample example, @Param("selective") SpvSpecificAttributeValue.Column ... selective);

    List<SpvSpecificAttributeValue> selectByExample(SpvSpecificAttributeValueExample example);

    SpvSpecificAttributeValue selectByPrimaryKeySelective(@Param("spvId") Integer spvId, @Param("selective") SpvSpecificAttributeValue.Column ... selective);

    SpvSpecificAttributeValue selectByPrimaryKey(Integer spvId);

    int updateByExampleSelective(@Param("record") SpvSpecificAttributeValue record, @Param("example") SpvSpecificAttributeValueExample example);

    int updateByExample(@Param("record") SpvSpecificAttributeValue record, @Param("example") SpvSpecificAttributeValueExample example);

    int updateByPrimaryKeySelective(SpvSpecificAttributeValue record);

    int updateByPrimaryKey(SpvSpecificAttributeValue record);
}