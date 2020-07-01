package com.bsp.server.mapper;

import com.bsp.server.domain.WtrWalletTransactionRecord;
import com.bsp.server.domain.WtrWalletTransactionRecordExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrWalletTransactionRecordMapper {
    long countByExample(WtrWalletTransactionRecordExample example);

    int deleteByExample(WtrWalletTransactionRecordExample example);

    int deleteByPrimaryKey(Integer transactionId);

    int insert(WtrWalletTransactionRecord record);

    int insertSelective(WtrWalletTransactionRecord record);

    WtrWalletTransactionRecord selectOneByExample(WtrWalletTransactionRecordExample example);

    WtrWalletTransactionRecord selectOneByExampleSelective(@Param("example") WtrWalletTransactionRecordExample example, @Param("selective") WtrWalletTransactionRecord.Column ... selective);

    List<WtrWalletTransactionRecord> selectByExampleSelective(@Param("example") WtrWalletTransactionRecordExample example, @Param("selective") WtrWalletTransactionRecord.Column ... selective);

    List<WtrWalletTransactionRecord> selectByExample(WtrWalletTransactionRecordExample example);

    WtrWalletTransactionRecord selectByPrimaryKeySelective(@Param("transactionId") Integer transactionId, @Param("selective") WtrWalletTransactionRecord.Column ... selective);

    WtrWalletTransactionRecord selectByPrimaryKey(Integer transactionId);

    int updateByExampleSelective(@Param("record") WtrWalletTransactionRecord record, @Param("example") WtrWalletTransactionRecordExample example);

    int updateByExample(@Param("record") WtrWalletTransactionRecord record, @Param("example") WtrWalletTransactionRecordExample example);

    int updateByPrimaryKeySelective(WtrWalletTransactionRecord record);

    int updateByPrimaryKey(WtrWalletTransactionRecord record);
}