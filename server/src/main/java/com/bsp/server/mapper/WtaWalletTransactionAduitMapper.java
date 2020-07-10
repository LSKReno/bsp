package com.bsp.server.mapper;

import com.bsp.server.domain.WtaWalletTransactionAduit;
import com.bsp.server.domain.WtaWalletTransactionAduitExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WtaWalletTransactionAduitMapper {
    long countByExample(WtaWalletTransactionAduitExample example);

    int deleteByExample(WtaWalletTransactionAduitExample example);

    int deleteByPrimaryKey(Integer transactionAuditId);

    int insert(WtaWalletTransactionAduit record);

    int insertSelective(WtaWalletTransactionAduit record);

    int insertSelective(Map<String,Object> mp);

    WtaWalletTransactionAduit selectOneByExample(WtaWalletTransactionAduitExample example);

    WtaWalletTransactionAduit selectOneByExampleSelective(@Param("example") WtaWalletTransactionAduitExample example, @Param("selective") WtaWalletTransactionAduit.Column ... selective);

    List<WtaWalletTransactionAduit> selectByExampleSelective(@Param("example") WtaWalletTransactionAduitExample example, @Param("selective") WtaWalletTransactionAduit.Column ... selective);

    List<WtaWalletTransactionAduit> selectByExample(WtaWalletTransactionAduitExample example);

    WtaWalletTransactionAduit selectByPrimaryKeySelective(@Param("transactionAuditId") Integer transactionAuditId, @Param("selective") WtaWalletTransactionAduit.Column ... selective);

    WtaWalletTransactionAduit selectByPrimaryKey(Integer transactionAuditId);

    int updateByExampleSelective(@Param("record") WtaWalletTransactionAduit record, @Param("example") WtaWalletTransactionAduitExample example);

    int updateByExample(@Param("record") WtaWalletTransactionAduit record, @Param("example") WtaWalletTransactionAduitExample example);

    int updateByPrimaryKeySelective(WtaWalletTransactionAduit record);

    int updateByPrimaryKey(WtaWalletTransactionAduit record);
}