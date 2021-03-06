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
import java.util.Map;

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
     * 查询流水
     */
    public void list(PageDto pageDto,String name) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WtrWalletTransactionRecordExample wtrWalletTransactionRecordExample = new WtrWalletTransactionRecordExample();
        WtrWalletTransactionRecordExample.Criteria criteria=wtrWalletTransactionRecordExample.createCriteria();
        criteria.andAccountNameEqualTo(name);
        List<WtrWalletTransactionRecord> wtrWalletTransactionRecordList = wtrWalletTransactionRecordMapper.selectByExample(wtrWalletTransactionRecordExample);
        PageInfo<WtrWalletTransactionRecord> pageInfo = new PageInfo<>(wtrWalletTransactionRecordList);
        pageDto.setTotal(pageInfo.getTotal());
        pageDto.setList(wtrWalletTransactionRecordList);
    }


    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto) {
        WtrWalletTransactionRecord wtrWalletTransactionRecord = CopyUtil.copy(wtrWalletTransactionRecordDto, WtrWalletTransactionRecord.class);
        wtrWalletTransactionRecord.setLastUpdateTime(new Date());
        if (StringUtils.isEmpty(wtrWalletTransactionRecordDto.getTransactionId())) {
            wtrWalletTransactionRecord.setCreateTime(new Date());
            this.insert(wtrWalletTransactionRecord);
        } else {
            this.update(wtrWalletTransactionRecord);
        }
        return wtrWalletTransactionRecord.getTransactionId();
    }

    public int saveWtrWalletTransactionRecord(WtrWalletTransactionRecord wtrWalletTransactionRecord) {
        wtrWalletTransactionRecord.setLastUpdateTime(new Date());
        if (StringUtils.isEmpty(wtrWalletTransactionRecord.getTransactionId())) {
            wtrWalletTransactionRecord.setCreateTime(new Date());
            this.insert(wtrWalletTransactionRecord);
        } else {
            this.update(wtrWalletTransactionRecord);
        }
        return wtrWalletTransactionRecord.getTransactionId();
    }

    /**
     * 新增
     */
    private int insert(WtrWalletTransactionRecord wtrWalletTransactionRecord) {
        Date now = new Date();
        return wtrWalletTransactionRecordMapper.insert(wtrWalletTransactionRecord);
    }

    public int insertSelective(Map<String,Object> mp){
        return wtrWalletTransactionRecordMapper.insertSelective(mp);
    }


    /**
     * 更新
     */
    private int update(WtrWalletTransactionRecord wtrWalletTransactionRecord) {
        return wtrWalletTransactionRecordMapper.updateByPrimaryKey(wtrWalletTransactionRecord);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        wtrWalletTransactionRecordMapper.deleteByPrimaryKey(id);
    }
}
