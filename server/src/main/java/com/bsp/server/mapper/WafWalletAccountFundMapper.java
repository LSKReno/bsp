package com.bsp.server.mapper;

import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.domain.WafWalletAccountFundExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WafWalletAccountFundMapper {
    long countByExample(WafWalletAccountFundExample example);

    int deleteByExample(WafWalletAccountFundExample example);

    int deleteByPrimaryKey(Integer buyerId);

    int insert(WafWalletAccountFund record);

    int insertSelective(WafWalletAccountFund record);

    WafWalletAccountFund selectOneByExample(WafWalletAccountFundExample example);

    WafWalletAccountFund selectOneByExampleSelective(@Param("example") WafWalletAccountFundExample example, @Param("selective") WafWalletAccountFund.Column ... selective);

    List<WafWalletAccountFund> selectByExampleSelective(@Param("example") WafWalletAccountFundExample example, @Param("selective") WafWalletAccountFund.Column ... selective);

    List<WafWalletAccountFund> selectByExample(WafWalletAccountFundExample example);

    WafWalletAccountFund selectByPrimaryKeySelective(@Param("buyerId") Integer buyerId, @Param("selective") WafWalletAccountFund.Column ... selective);

    WafWalletAccountFund selectByPrimaryKey(Integer buyerId);

    int updateByExampleSelective(@Param("record") WafWalletAccountFund record, @Param("example") WafWalletAccountFundExample example);

    int updateByExample(@Param("record") WafWalletAccountFund record, @Param("example") WafWalletAccountFundExample example);

    int updateByPrimaryKeySelective(WafWalletAccountFund record);

    int updateByPrimaryKey(WafWalletAccountFund record);
}