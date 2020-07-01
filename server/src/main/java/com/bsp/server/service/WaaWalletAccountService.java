package com.bsp.server.service;

import com.bsp.server.domain.WaaWalletAccount;
import com.bsp.server.domain.WaaWalletAccountExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.WaaWalletAccountDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.WaaWalletAccountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;

@Service
public class WaaWalletAccountService {

    @Resource
    private WaaWalletAccountMapper waaWalletAccountMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WaaWalletAccountExample waaWalletAccountExample = new WaaWalletAccountExample();
        List<WaaWalletAccount> waaWalletAccountList = waaWalletAccountMapper.selectByExample(waaWalletAccountExample);
        PageInfo<WaaWalletAccount> pageInfo = new PageInfo<>(waaWalletAccountList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WaaWalletAccountDto> waaWalletAccountDtoList = CopyUtil.copyList(waaWalletAccountList, WaaWalletAccountDto.class);
        pageDto.setList(waaWalletAccountDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(WaaWalletAccountDto waaWalletAccountDto) {
        WaaWalletAccount waaWalletAccount = CopyUtil.copy(waaWalletAccountDto, WaaWalletAccount.class);
        if (StringUtils.isEmpty(waaWalletAccountDto.getBuyerId())) {
            this.insert(waaWalletAccount);
        } else {
            this.update(waaWalletAccount);
        }
    }

    /**
     * 新增
     */
    private void insert(WaaWalletAccount waaWalletAccount) {
        Date now = new Date();
        waaWalletAccountMapper.insert(waaWalletAccount);
    }

    /**
     * 更新
     */
    private void update(WaaWalletAccount waaWalletAccount) {
        waaWalletAccountMapper.updateByPrimaryKey(waaWalletAccount);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        waaWalletAccountMapper.deleteByPrimaryKey(id);
    }
}
