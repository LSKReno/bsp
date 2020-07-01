package com.bsp.server.service;

import com.bsp.server.domain.DrpDropshipPriceExample;
import com.bsp.server.dto.DrpDropshipPriceDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.DrpDropshipPrice;
import com.bsp.server.mapper.DrpDropshipPriceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DrpDropshipPriceService {

    @Resource
    private DrpDropshipPriceMapper drpDropshipPriceMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        DrpDropshipPriceExample drpDropshipPriceExample = new DrpDropshipPriceExample();
        List<DrpDropshipPrice> drpDropshipPriceList = drpDropshipPriceMapper.selectByExample(drpDropshipPriceExample);
        PageInfo<DrpDropshipPrice> pageInfo = new PageInfo<>(drpDropshipPriceList);
        pageDto.setTotal(pageInfo.getTotal());
        List<DrpDropshipPriceDto> drpDropshipPriceDtoList = CopyUtil.copyList(drpDropshipPriceList, DrpDropshipPriceDto.class);
        pageDto.setList(drpDropshipPriceDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(DrpDropshipPriceDto drpDropshipPriceDto) {
        DrpDropshipPrice drpDropshipPrice = CopyUtil.copy(drpDropshipPriceDto, DrpDropshipPrice.class);
        if (StringUtils.isEmpty(drpDropshipPriceDto.getDrpId())) {
            this.insert(drpDropshipPrice);
        } else {
            this.update(drpDropshipPrice);
        }
    }

    /**
     * 新增
     */
    private void insert(DrpDropshipPrice drpDropshipPrice) {
        drpDropshipPriceMapper.insert(drpDropshipPrice);
    }

    /**
     * 更新
     */
    private void update(DrpDropshipPrice drpDropshipPrice) {
        drpDropshipPriceMapper.updateByPrimaryKey(drpDropshipPrice);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        drpDropshipPriceMapper.deleteByPrimaryKey(id);
    }
}
