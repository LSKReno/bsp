package com.bsp.server.mapper;

import com.bsp.server.domain.WaaWalletAccount;
import com.bsp.server.domain.WaaWalletAccountExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaaWalletAccountMapper {
    long countByExample(WaaWalletAccountExample example);

    int deleteByExample(WaaWalletAccountExample example);

    int deleteByPrimaryKey(Integer buyerId);

    int insert(WaaWalletAccount record);

    int insertSelective(WaaWalletAccount record);

    WaaWalletAccount selectOneByExample(WaaWalletAccountExample example);

    WaaWalletAccount selectOneByExampleSelective(@Param("example") WaaWalletAccountExample example, @Param("selective") WaaWalletAccount.Column ... selective);

    List<WaaWalletAccount> selectByExampleSelective(@Param("example") WaaWalletAccountExample example, @Param("selective") WaaWalletAccount.Column ... selective);

    List<WaaWalletAccount> selectByExample(WaaWalletAccountExample example);

    WaaWalletAccount selectByPrimaryKeySelective(@Param("buyerId") Integer buyerId, @Param("selective") WaaWalletAccount.Column ... selective);

    WaaWalletAccount selectByPrimaryKey(Integer buyerId);

    int updateByExampleSelective(@Param("record") WaaWalletAccount record, @Param("example") WaaWalletAccountExample example);

    int updateByExample(@Param("record") WaaWalletAccount record, @Param("example") WaaWalletAccountExample example);

    int updateByPrimaryKeySelective(WaaWalletAccount record);

    int updateByPrimaryKey(WaaWalletAccount record);

    WaaWalletAccount selectByName(String username);
}
