package com.bsp.server.service;

import com.bsp.server.domain.BrdBrandExample;
import com.bsp.server.dto.BrdBrandDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.BrdBrand;
import com.bsp.server.mapper.BrdBrandMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrdBrandService {

    @Resource
    private BrdBrandMapper brdBrandMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        BrdBrandExample brdBrandExample = new BrdBrandExample();
        List<BrdBrand> brdBrandList = brdBrandMapper.selectByExample(brdBrandExample);
        PageInfo<BrdBrand> pageInfo = new PageInfo<>(brdBrandList);
        pageDto.setTotal(pageInfo.getTotal());
        List<BrdBrandDto> brdBrandDtoList = CopyUtil.copyList(brdBrandList, BrdBrandDto.class);
        pageDto.setList(brdBrandDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(BrdBrandDto brdBrandDto) {
        BrdBrand brdBrand = CopyUtil.copy(brdBrandDto, BrdBrand.class);
        if (StringUtils.isEmpty(brdBrandDto.getBrdId())) {
            this.insert(brdBrand);
        } else {
            this.update(brdBrand);
        }
    }

    /**
     * 新增
     */
    private void insert(BrdBrand brdBrand) {
        brdBrandMapper.insert(brdBrand);
    }

    /**
     * 更新
     */
    private void update(BrdBrand brdBrand) {
        brdBrandMapper.updateByPrimaryKey(brdBrand);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        brdBrandMapper.deleteByPrimaryKey(id);
    }
}
