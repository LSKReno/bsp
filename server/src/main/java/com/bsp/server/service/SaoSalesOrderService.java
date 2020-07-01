package com.bsp.server.service;

import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.SaoSalesOrderExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.SaoSalesOrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaoSalesOrderService {

    @Resource
    private SaoSalesOrderMapper saoSalesOrderMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SaoSalesOrderExample saoSalesOrderExample = new SaoSalesOrderExample();
        List<SaoSalesOrder> saoSalesOrderList = saoSalesOrderMapper.selectByExample(saoSalesOrderExample);
        PageInfo<SaoSalesOrder> pageInfo = new PageInfo<>(saoSalesOrderList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SaoSalesOrderDto> saoSalesOrderDtoList = CopyUtil.copyList(saoSalesOrderList, SaoSalesOrderDto.class);
        pageDto.setList(saoSalesOrderDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SaoSalesOrderDto saoSalesOrderDto) {
        SaoSalesOrder saoSalesOrder = CopyUtil.copy(saoSalesOrderDto, SaoSalesOrder.class);
        if (StringUtils.isEmpty(saoSalesOrderDto.getSaoId())) {
            this.insert(saoSalesOrder);
        } else {
            this.update(saoSalesOrder);
        }
    }

    /**
     * 新增
     */
    private void insert(SaoSalesOrder saoSalesOrder) {
        saoSalesOrderMapper.insert(saoSalesOrder);
    }

    /**
     * 更新
     */
    private void update(SaoSalesOrder saoSalesOrder) {
        saoSalesOrderMapper.updateByPrimaryKey(saoSalesOrder);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        saoSalesOrderMapper.deleteByPrimaryKey(id);
    }
}
