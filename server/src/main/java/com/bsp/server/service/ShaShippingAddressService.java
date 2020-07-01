package com.bsp.server.service;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ShaShippingAddressDto;
import com.bsp.server.mapper.ShaShippingAddressMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.ShaShippingAddress;
import com.bsp.server.domain.ShaShippingAddressExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShaShippingAddressService {

    @Resource
    private ShaShippingAddressMapper shaShippingAddressMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        ShaShippingAddressExample shaShippingAddressExample = new ShaShippingAddressExample();
        List<ShaShippingAddress> shaShippingAddressList = shaShippingAddressMapper.selectByExample(shaShippingAddressExample);
        PageInfo<ShaShippingAddress> pageInfo = new PageInfo<>(shaShippingAddressList);
        pageDto.setTotal(pageInfo.getTotal());
        List<ShaShippingAddressDto> shaShippingAddressDtoList = CopyUtil.copyList(shaShippingAddressList, ShaShippingAddressDto.class);
        pageDto.setList(shaShippingAddressDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(ShaShippingAddressDto shaShippingAddressDto) {
        ShaShippingAddress shaShippingAddress = CopyUtil.copy(shaShippingAddressDto, ShaShippingAddress.class);
        if (StringUtils.isEmpty(shaShippingAddressDto.getId())) {
            this.insert(shaShippingAddress);
        } else {
            this.update(shaShippingAddress);
        }
    }

    /**
     * 新增
     */
    private void insert(ShaShippingAddress shaShippingAddress) {
        shaShippingAddressMapper.insert(shaShippingAddress);
    }

    /**
     * 更新
     */
    private void update(ShaShippingAddress shaShippingAddress) {
        shaShippingAddressMapper.updateByPrimaryKey(shaShippingAddress);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        shaShippingAddressMapper.deleteByPrimaryKey(id);
    }
}
