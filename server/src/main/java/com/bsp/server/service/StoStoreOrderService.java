package com.bsp.server.service;

import com.bsp.server.domain.StoStoreOrder;
import com.bsp.server.domain.StoStoreOrderExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.dto.StoStoreOrderDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.StoStoreOrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoStoreOrderService {

    @Resource
    private StoStoreOrderMapper stoStoreOrderMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        StoStoreOrderExample stoStoreOrderExample = new StoStoreOrderExample();
        List<StoStoreOrder> stoStoreOrderList = stoStoreOrderMapper.selectByExample(stoStoreOrderExample);
        PageInfo<StoStoreOrder> pageInfo = new PageInfo<>(stoStoreOrderList);
        pageDto.setTotal(pageInfo.getTotal());
        List<StoStoreOrderDto> stoStoreOrderDtoList = CopyUtil.copyList(stoStoreOrderList, StoStoreOrderDto.class);
        pageDto.setList(stoStoreOrderDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(StoStoreOrderDto stoStoreOrderDto) {
        StoStoreOrder stoStoreOrder = CopyUtil.copy(stoStoreOrderDto, StoStoreOrder.class);
        if (StringUtils.isEmpty(stoStoreOrderDto.getStoId())) {
            this.insert(stoStoreOrder);
        } else {
            this.update(stoStoreOrder);
        }
    }

    /**
     * 新增
     */
    private void insert(StoStoreOrder stoStoreOrder) {
        stoStoreOrderMapper.insert(stoStoreOrder);
    }

    /**
     * 更新
     */
    private void update(StoStoreOrder stoStoreOrder) {
        stoStoreOrderMapper.updateByPrimaryKey(stoStoreOrder);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        stoStoreOrderMapper.deleteByPrimaryKey(id);
    }

    public List<StoStoreOrderDto> selectByStrId(Integer strId) {
        return CopyUtil.copyList(stoStoreOrderMapper.selectByStrId(strId), StoStoreOrderDto.class);
    }
}
