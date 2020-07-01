package com.bsp.server.service;

import com.bsp.server.domain.WtrWalletTransactionRecordExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.WtrWalletTransactionRecordDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.WtrWalletTransactionRecord;
import com.bsp.server.mapper.WtrWalletTransactionRecordMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;

@Service
public class WtrWalletTransactionRecordService {

    @Resource
    private WtrWalletTransactionRecordMapper wtrWalletTransactionRecordMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WtrWalletTransactionRecordExample wtrWalletTransactionRecordExample = new WtrWalletTransactionRecordExample();
        List<WtrWalletTransactionRecord> wtrWalletTransactionRecordList = wtrWalletTransactionRecordMapper.selectByExample(wtrWalletTransactionRecordExample);
        PageInfo<WtrWalletTransactionRecord> pageInfo = new PageInfo<>(wtrWalletTransactionRecordList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WtrWalletTransactionRecordDto> wtrWalletTransactionRecordDtoList = CopyUtil.copyList(wtrWalletTransactionRecordList, WtrWalletTransactionRecordDto.class);
        pageDto.setList(wtrWalletTransactionRecordDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto) {
        WtrWalletTransactionRecord wtrWalletTransactionRecord = CopyUtil.copy(wtrWalletTransactionRecordDto, WtrWalletTransactionRecord.class);
        if (StringUtils.isEmpty(wtrWalletTransactionRecordDto.getTransactionId())) {
            this.insert(wtrWalletTransactionRecord);
        } else {
            this.update(wtrWalletTransactionRecord);
        }
    }

    /**
     * 新增
     */
    private void insert(WtrWalletTransactionRecord wtrWalletTransactionRecord) {
        Date now = new Date();
        wtrWalletTransactionRecordMapper.insert(wtrWalletTransactionRecord);
    }

    /**
     * 更新
     */
    private void update(WtrWalletTransactionRecord wtrWalletTransactionRecord) {
        wtrWalletTransactionRecordMapper.updateByPrimaryKey(wtrWalletTransactionRecord);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        wtrWalletTransactionRecordMapper.deleteByPrimaryKey(id);
    }
}
