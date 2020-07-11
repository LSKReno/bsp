package com.bsp.server.service;

import com.bsp.server.domain.WtaWalletTransactionAduit;
import com.bsp.server.domain.WtaWalletTransactionAduitExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.WtaWalletTransactionAduitDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.WtaWalletTransactionAduitMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WtaWalletTransactionAduitService {

    @Resource
    private WtaWalletTransactionAduitMapper wtaWalletTransactionAduitMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        WtaWalletTransactionAduitExample wtaWalletTransactionAduitExample = new WtaWalletTransactionAduitExample();
        List<WtaWalletTransactionAduit> wtaWalletTransactionAduitList = wtaWalletTransactionAduitMapper.selectByExample(wtaWalletTransactionAduitExample);
        PageInfo<WtaWalletTransactionAduit> pageInfo = new PageInfo<>(wtaWalletTransactionAduitList);
        pageDto.setTotal(pageInfo.getTotal());
        List<WtaWalletTransactionAduitDto> wtaWalletTransactionAduitDtoList = CopyUtil.copyList(wtaWalletTransactionAduitList, WtaWalletTransactionAduitDto.class);
        pageDto.setList(wtaWalletTransactionAduitDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
        WtaWalletTransactionAduit wtaWalletTransactionAduit = CopyUtil.copy(wtaWalletTransactionAduitDto, WtaWalletTransactionAduit.class);
        if (StringUtils.isEmpty(wtaWalletTransactionAduitDto.getTransactionAuditId())) {
            return this.insert(wtaWalletTransactionAduit);
        } else {
            return this.update(wtaWalletTransactionAduit);
        }
    }

    /**
     * 新增
     */
    private int insert(WtaWalletTransactionAduit wtaWalletTransactionAduit) {
        return wtaWalletTransactionAduitMapper.insert(wtaWalletTransactionAduit);
    }

    /**
     * 更新
     */
    private int update(WtaWalletTransactionAduit wtaWalletTransactionAduit) {
        return wtaWalletTransactionAduitMapper.updateByPrimaryKey(wtaWalletTransactionAduit);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        wtaWalletTransactionAduitMapper.deleteByPrimaryKey(id);
    }
}
