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
import java.util.Map;

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
     *查询钱包账户&密码校验
     */
    public WaaWalletAccount find(String accountName,String pwd) {
        WaaWalletAccountExample waaWalletAccountExample = new WaaWalletAccountExample();
        WaaWalletAccountExample.Criteria criteria=waaWalletAccountExample.createCriteria();
        criteria.andAccountNameEqualTo(accountName);
        criteria.andIsActiveEqualTo("1");
        criteria.andStatusEqualTo(new Byte("7"));
        if(!StringUtils.isEmpty(pwd)){
            criteria.andPasswordEqualTo(pwd);
        }
        return waaWalletAccountMapper.selectOneByExample(waaWalletAccountExample);
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

    public int insertSelective(WaaWalletAccount waaWalletAccount){
        return waaWalletAccountMapper.insertSelective(waaWalletAccount);
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

    public WaaWalletAccountDto selectByName(String username) {
        return CopyUtil.copy(waaWalletAccountMapper.selectByName(username), WaaWalletAccountDto.class);
    }
}
