package com.bsp.server.mapper;

import com.bsp.server.domain.SpaSpecificAttribute;
import com.bsp.server.domain.SpaSpecificAttributeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaSpecificAttributeMapper {
    long countByExample(SpaSpecificAttributeExample example);

    int deleteByExample(SpaSpecificAttributeExample example);

    int deleteByPrimaryKey(Integer spaId);

    int insert(SpaSpecificAttribute record);

    int insertSelective(SpaSpecificAttribute record);

    SpaSpecificAttribute selectOneByExample(SpaSpecificAttributeExample example);

    SpaSpecificAttribute selectOneByExampleSelective(@Param("example") SpaSpecificAttributeExample example, @Param("selective") SpaSpecificAttribute.Column ... selective);

    List<SpaSpecificAttribute> selectByExampleSelective(@Param("example") SpaSpecificAttributeExample example, @Param("selective") SpaSpecificAttribute.Column ... selective);

    List<SpaSpecificAttribute> selectByExample(SpaSpecificAttributeExample example);

    SpaSpecificAttribute selectByPrimaryKeySelective(@Param("spaId") Integer spaId, @Param("selective") SpaSpecificAttribute.Column ... selective);

    SpaSpecificAttribute selectByPrimaryKey(Integer spaId);

    int updateByExampleSelective(@Param("record") SpaSpecificAttribute record, @Param("example") SpaSpecificAttributeExample example);

    int updateByExample(@Param("record") SpaSpecificAttribute record, @Param("example") SpaSpecificAttributeExample example);

    int updateByPrimaryKeySelective(SpaSpecificAttribute record);

    int updateByPrimaryKey(SpaSpecificAttribute record);
}