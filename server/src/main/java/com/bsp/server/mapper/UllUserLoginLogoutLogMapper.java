package com.bsp.server.mapper;

import com.bsp.server.domain.UllUserLoginLogoutLog;
import com.bsp.server.domain.UllUserLoginLogoutLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UllUserLoginLogoutLogMapper {
    long countByExample(UllUserLoginLogoutLogExample example);

    int deleteByExample(UllUserLoginLogoutLogExample example);

    int deleteByPrimaryKey(Integer ullId);

    int insert(UllUserLoginLogoutLog record);

    int insertSelective(UllUserLoginLogoutLog record);

    UllUserLoginLogoutLog selectOneByExample(UllUserLoginLogoutLogExample example);

    UllUserLoginLogoutLog selectOneByExampleSelective(@Param("example") UllUserLoginLogoutLogExample example, @Param("selective") UllUserLoginLogoutLog.Column ... selective);

    List<UllUserLoginLogoutLog> selectByExampleSelective(@Param("example") UllUserLoginLogoutLogExample example, @Param("selective") UllUserLoginLogoutLog.Column ... selective);

    List<UllUserLoginLogoutLog> selectByExample(UllUserLoginLogoutLogExample example);

    UllUserLoginLogoutLog selectByPrimaryKeySelective(@Param("ullId") Integer ullId, @Param("selective") UllUserLoginLogoutLog.Column ... selective);

    UllUserLoginLogoutLog selectByPrimaryKey(Integer ullId);

    int updateByExampleSelective(@Param("record") UllUserLoginLogoutLog record, @Param("example") UllUserLoginLogoutLogExample example);

    int updateByExample(@Param("record") UllUserLoginLogoutLog record, @Param("example") UllUserLoginLogoutLogExample example);

    int updateByPrimaryKeySelective(UllUserLoginLogoutLog record);

    int updateByPrimaryKey(UllUserLoginLogoutLog record);
}