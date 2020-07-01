package com.bsp.server.service;

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
import java.util.List;

@Service
public class WafWalletAccountFundService {

    @Resource
    private WafWalletAccountFundMapper wafWalletAccountFundMapper;

    /**
     * 列表查询
     */
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
     * 保存，id有值时更新，无值时新增
     */
    public void save(WafWalletAccountFundDto wafWalletAccountFundDto) {
        WafWalletAccountFund wafWalletAccountFund = CopyUtil.copy(wafWalletAccountFundDto, WafWalletAccountFund.class);
        if (StringUtils.isEmpty(wafWalletAccountFundDto.getBuyerId())) {
            this.insert(wafWalletAccountFund);
        } else {
            this.update(wafWalletAccountFund);
        }
    }

    /**
     * 新增
     */
    private void insert(WafWalletAccountFund wafWalletAccountFund) {
        wafWalletAccountFundMapper.insert(wafWalletAccountFund);
    }

    /**
     * 更新
     */
    private void update(WafWalletAccountFund wafWalletAccountFund) {
        wafWalletAccountFundMapper.updateByPrimaryKey(wafWalletAccountFund);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        wafWalletAccountFundMapper.deleteByPrimaryKey(id);
    }
}
