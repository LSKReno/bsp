package com.bsp.server.mapper;

import com.bsp.server.domain.EbaEbayAuthorization;
import com.bsp.server.domain.EbaEbayAuthorizationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbaEbayAuthorizationMapper {
    long countByExample(EbaEbayAuthorizationExample example);

    int deleteByExample(EbaEbayAuthorizationExample example);

    int deleteByPrimaryKey(Integer ebaId);

    int insert(EbaEbayAuthorization record);

    int insertSelective(EbaEbayAuthorization record);

    EbaEbayAuthorization selectOneByExample(EbaEbayAuthorizationExample example);

    EbaEbayAuthorization selectOneByExampleSelective(@Param("example") EbaEbayAuthorizationExample example, @Param("selective") EbaEbayAuthorization.Column ... selective);

    EbaEbayAuthorization selectOneByExampleWithBLOBs(EbaEbayAuthorizationExample example);

    List<EbaEbayAuthorization> selectByExampleSelective(@Param("example") EbaEbayAuthorizationExample example, @Param("selective") EbaEbayAuthorization.Column ... selective);

    List<EbaEbayAuthorization> selectByExampleWithBLOBs(EbaEbayAuthorizationExample example);

    List<EbaEbayAuthorization> selectByExample(EbaEbayAuthorizationExample example);

    EbaEbayAuthorization selectByPrimaryKeySelective(@Param("ebaId") Integer ebaId, @Param("selective") EbaEbayAuthorization.Column ... selective);

    EbaEbayAuthorization selectByPrimaryKey(Integer ebaId);

    int updateByExampleSelective(@Param("record") EbaEbayAuthorization record, @Param("example") EbaEbayAuthorizationExample example);

    int updateByExampleWithBLOBs(@Param("record") EbaEbayAuthorization record, @Param("example") EbaEbayAuthorizationExample example);

    int updateByExample(@Param("record") EbaEbayAuthorization record, @Param("example") EbaEbayAuthorizationExample example);

    int updateByPrimaryKeySelective(EbaEbayAuthorization record);

    int updateByPrimaryKeyWithBLOBs(EbaEbayAuthorization record);

    int updateByPrimaryKey(EbaEbayAuthorization record);
}