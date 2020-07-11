package com.bsp.server.service;

import com.bsp.server.domain.OfpOfferPrice;
import com.bsp.server.domain.OfpOfferPriceExample;
import com.bsp.server.dto.OfpOfferPriceDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.OfpOfferPriceMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;
import java.util.Map;

@Service
public class OfpOfferPriceService {

    @Resource
    private OfpOfferPriceMapper ofpOfferPriceMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        OfpOfferPriceExample ofpOfferPriceExample = new OfpOfferPriceExample();
        List<OfpOfferPrice> ofpOfferPriceList = ofpOfferPriceMapper.selectByExample(ofpOfferPriceExample);
        PageInfo<OfpOfferPrice> pageInfo = new PageInfo<>(ofpOfferPriceList);
        pageDto.setTotal(pageInfo.getTotal());
        List<OfpOfferPriceDto> ofpOfferPriceDtoList = CopyUtil.copyList(ofpOfferPriceList, OfpOfferPriceDto.class);
        pageDto.setList(ofpOfferPriceDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(OfpOfferPriceDto ofpOfferPriceDto) {
        OfpOfferPrice ofpOfferPrice = CopyUtil.copy(ofpOfferPriceDto, OfpOfferPrice.class);
        if (StringUtils.isEmpty(ofpOfferPriceDto.getOfpId())) {
            this.insert(ofpOfferPrice);
        } else {
            this.update(ofpOfferPrice);
        }
    }

    /**
     * 新增
     */
    private void insert(OfpOfferPrice ofpOfferPrice) {
        Date now = new Date();
        ofpOfferPriceMapper.insert(ofpOfferPrice);
    }

    public int insertSelective(Map<String,Object> mp) {
        return ofpOfferPriceMapper.insertSelective(mp);
    }

    /**
     * 更新
     */
    private void update(OfpOfferPrice ofpOfferPrice) {
        ofpOfferPriceMapper.updateByPrimaryKey(ofpOfferPrice);
    }

    public int updateSelective(Map<String,Object> mp) {
        return ofpOfferPriceMapper.updateSelective(mp);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        ofpOfferPriceMapper.deleteByPrimaryKey(id);
    }
}
