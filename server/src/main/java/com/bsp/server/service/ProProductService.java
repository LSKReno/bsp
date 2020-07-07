package com.bsp.server.service;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ProProductDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.ProProduct;
import com.bsp.server.domain.ProProductExample;
import com.bsp.server.mapper.ProProductMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProProductService {

    @Resource
    private ProProductMapper proProductMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        ProProductExample proProductExample = new ProProductExample();
        List<ProProduct> proProductList = proProductMapper.selectByExample(proProductExample);
        PageInfo<ProProduct> pageInfo = new PageInfo<>(proProductList);
        pageDto.setTotal(pageInfo.getTotal());
        List<ProProductDto> proProductDtoList = CopyUtil.copyList(proProductList, ProProductDto.class);
        pageDto.setList(proProductDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(ProProductDto proProductDto) {
        ProProduct proProduct = CopyUtil.copy(proProductDto, ProProduct.class);
        if (StringUtils.isEmpty(proProductDto.getProId())) {
            this.insert(proProduct);
        } else {
            this.update(proProduct);
        }
    }

    /**
     * 新增
     */
    private void insert(ProProduct proProduct) {
        proProductMapper.insert(proProduct);
    }

    /**
     * 更新
     */
    private void update(ProProduct proProduct) {
        proProductMapper.updateByPrimaryKey(proProduct);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        proProductMapper.deleteByPrimaryKey(id);
    }

    public ProProductDto selectByPrimaryKey(Integer proId) {
        ProProduct proProduct = proProductMapper.selectByPrimaryKey(proId);
        ProProductDto proProductDto = CopyUtil.copy(proProduct, ProProductDto.class);
        return proProductDto;
    }
}
