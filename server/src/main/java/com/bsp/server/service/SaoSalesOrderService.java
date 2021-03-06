package com.bsp.server.service;

import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.SaoSalesOrderExample;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.SaoSalesOrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    public int save(SaoSalesOrderDto saoSalesOrderDto) {
        SaoSalesOrder saoSalesOrder = CopyUtil.copy(saoSalesOrderDto, SaoSalesOrder.class);
        if (StringUtils.isEmpty(saoSalesOrderDto.getSaoId())) {
            this.insert(saoSalesOrder);
        } else {
            this.update(saoSalesOrder);
        }
        return saoSalesOrder.getSaoId();
    }

    /**
     * 新增
     */
    private int insert(SaoSalesOrder saoSalesOrder) {
        return saoSalesOrderMapper.insert(saoSalesOrder);
    }

    /**
     * 更新
     */
    private int update(SaoSalesOrder saoSalesOrder) {
        return saoSalesOrderMapper.updateByPrimaryKey(saoSalesOrder);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        saoSalesOrderMapper.deleteByPrimaryKey(id);
    }



    public List<SaoSalesOrderDto> selectByManID(Integer manBuyerId, String ORDER_STS) {
        List<SaoSalesOrder> saoSalesOrders = saoSalesOrderMapper.selectByManID(manBuyerId, ORDER_STS);
        List<SaoSalesOrderDto> saoSalesOrderDtos = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(int i=0; i< saoSalesOrders.size(); i++){
            SaoSalesOrderDto saoSalesOrderDto = CopyUtil.copy(saoSalesOrders.get(i), SaoSalesOrderDto.class);
            saoSalesOrderDto.setLastUpdateDate(formatter.format(saoSalesOrders.get(i).getLastUpdateDate()));
            saoSalesOrderDto.setCreationDate(formatter.format(saoSalesOrders.get(i).getCreationDate()));
            if(saoSalesOrders.get(i).getPaymentDate() != null){
                saoSalesOrderDto.setPaymentDate(formatter.format(saoSalesOrders.get(i).getPaymentDate()));
            }
            saoSalesOrderDtos.add(saoSalesOrderDto);
        }
        System.out.println(saoSalesOrderDtos);
//        List<SaoSalesOrderDto> saoSalesOrderDtos = CopyUtil.copyList(saoSalesOrders, SaoSalesOrderDto.class);
        return saoSalesOrderDtos;
    }

    public SaoSalesOrderDto selectByPrimaryKey(Integer saoId) {
        return CopyUtil.copy(saoSalesOrderMapper.selectByPrimaryKey(saoId), SaoSalesOrderDto.class);
    }

    public int changeToSHIPPED(Integer saoId) {
        SaoSalesOrder salesOrder = new SaoSalesOrder();
        salesOrder.setSaoId(saoId);
        salesOrder.setOrderSts("SHIPPED");
        salesOrder.setLastUpdateDate(new Date());
        return saoSalesOrderMapper.updateByPrimaryKeySelective(salesOrder);
    }

    public List<SaoSalesOrderDto> selectByStoId(Integer stoId, String ORDER_STS) {
        List<SaoSalesOrder> saoSalesOrders = saoSalesOrderMapper.selectByStoId(stoId, ORDER_STS);
        List<SaoSalesOrderDto> saoSalesOrderDtos = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(int i=0; i< saoSalesOrders.size(); i++){
            SaoSalesOrderDto saoSalesOrderDto = CopyUtil.copy(saoSalesOrders.get(i), SaoSalesOrderDto.class);
            saoSalesOrderDto.setLastUpdateDate(formatter.format(saoSalesOrders.get(i).getLastUpdateDate()));
            saoSalesOrderDto.setCreationDate(formatter.format(saoSalesOrders.get(i).getCreationDate()));
            if(saoSalesOrders.get(i).getPaymentDate() != null){
                saoSalesOrderDto.setPaymentDate(formatter.format(saoSalesOrders.get(i).getPaymentDate()));
            }
            saoSalesOrderDtos.add(saoSalesOrderDto);
        }
        System.out.println(saoSalesOrderDtos);
        return saoSalesOrderDtos;
//        return CopyUtil.copyList(saoSalesOrderMapper.selectByStoId(stoId, ORDER_STS), SaoSalesOrderDto.class);
    }

    public int cancelSHIPPED(Integer saoId) {
        SaoSalesOrder salesOrder = new SaoSalesOrder();
        salesOrder.setSaoId(saoId);
        salesOrder.setOrderSts("Canceled");
        salesOrder.setLastUpdateDate(new Date());
        return saoSalesOrderMapper.updateByPrimaryKeySelective(salesOrder);
    }

    public int changeToWattingSHIPPED(Integer saoId) {
        SaoSalesOrder salesOrder = new SaoSalesOrder();
        salesOrder.setSaoId(saoId);
        salesOrder.setOrderSts("AwaitingShipment");
        salesOrder.setPaymentDate(new Date());
        salesOrder.setLastUpdateDate(new Date());
        return saoSalesOrderMapper.updateByPrimaryKeySelective(salesOrder);
    }
}
