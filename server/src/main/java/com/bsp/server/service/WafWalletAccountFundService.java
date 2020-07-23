package com.bsp.server.service;

import com.bsp.server.domain.WaaWalletAccount;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.domain.WafWalletAccountFundExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.WafWalletAccountFundDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.WafWalletAccountFundMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class WafWalletAccountFundService {

    @Resource
    private WafWalletAccountFundMapper wafWalletAccountFundMapper;

    public Map<String,Object> getBeforeValue(Map<String,Object> mp){
        return wafWalletAccountFundMapper.getBeforeValue(mp);
    }

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WafWalletAccountFundExample wafWalletAccountFundExample = new WafWalletAccountFundExample();
        List<WafWalletAccountFund> wafWalletAccountFundList = wafWalletAccountFundMapper.selectByExample(wafWalletAccountFundExample);
        PageInfo<WafWalletAccountFund> pageInfo = new PageInfo<>(wafWalletAccountFundList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WafWalletAccountFundDto> wafWalletAccountFundDtoList = CopyUtil.copyList(wafWalletAccountFundList, WafWalletAccountFundDto.class);
        pageDto.setList(wafWalletAccountFundDtoList);
    }

    /**
     * 列表查询
     */
    public WafWalletAccountFund list(Integer id) {
        return wafWalletAccountFundMapper.selectByPrimaryKey(id);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(WafWalletAccountFundDto wafWalletAccountFundDto) {
        WafWalletAccountFund wafWalletAccountFund = CopyUtil.copy(wafWalletAccountFundDto, WafWalletAccountFund.class);
        if (StringUtils.isEmpty(wafWalletAccountFundDto.getBuyerId())) {
            this.insert(wafWalletAccountFund);
        } else {
            this.update(wafWalletAccountFund);
        }
        return wafWalletAccountFund.getBuyerId();
    }

    public int saveWafWalletAccountFund(WafWalletAccountFund wafWalletAccountFund) {
        if (StringUtils.isEmpty(wafWalletAccountFund.getBuyerId())) {
            this.insert(wafWalletAccountFund);
        } else {
            this.update(wafWalletAccountFund);
        }
        return wafWalletAccountFund.getBuyerId();
    }

    /**
     * 新增
     */
    private int insert(WafWalletAccountFund wafWalletAccountFund) {
        return wafWalletAccountFundMapper.insert(wafWalletAccountFund);
    }

    public int insertSelective(WafWalletAccountFund wafWalletAccountFund){
        return wafWalletAccountFundMapper.insertSelective(wafWalletAccountFund);
    }

    /**
     * 更新
     */
    private int update(WafWalletAccountFund wafWalletAccountFund) {
        return wafWalletAccountFundMapper.updateByPrimaryKeySelective(wafWalletAccountFund);
    }

    public int updateByPrimaryKeySelective(Map<String,Object> mp){

        return wafWalletAccountFundMapper.updateByPrimaryKeySelective(mp);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        wafWalletAccountFundMapper.deleteByPrimaryKey(id);
    }

    public WafWalletAccountFundDto selectByPrimaryKey(Integer buyerId) {
        return CopyUtil.copy(wafWalletAccountFundMapper.selectByPrimaryKey(buyerId), WafWalletAccountFundDto.class);
    }
}
