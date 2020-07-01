package com.bsp.server.service;

import com.bsp.server.domain.ManManufacturerExample;
import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.ManManufacturer;
import com.bsp.server.mapper.ManManufacturerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManManufacturerService {

    @Resource
    private ManManufacturerMapper manManufacturerMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        ManManufacturerExample manManufacturerExample = new ManManufacturerExample();
        List<ManManufacturer> manManufacturerList = manManufacturerMapper.selectByExample(manManufacturerExample);
        PageInfo<ManManufacturer> pageInfo = new PageInfo<>(manManufacturerList);
        pageDto.setTotal(pageInfo.getTotal());
        List<ManManufacturerDto> manManufacturerDtoList = CopyUtil.copyList(manManufacturerList, ManManufacturerDto.class);
        pageDto.setList(manManufacturerDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(ManManufacturerDto manManufacturerDto) {
        ManManufacturer manManufacturer = CopyUtil.copy(manManufacturerDto, ManManufacturer.class);
        if (StringUtils.isEmpty(manManufacturerDto.getManId())) {
            this.insert(manManufacturer);
        } else {
            this.update(manManufacturer);
        }
    }

    /**
     * 新增
     */
    private void insert(ManManufacturer manManufacturer) {
        manManufacturerMapper.insert(manManufacturer);
    }

    /**
     * 更新
     */
    private void update(ManManufacturer manManufacturer) {
        manManufacturerMapper.updateByPrimaryKey(manManufacturer);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        manManufacturerMapper.deleteByPrimaryKey(id);
    }
}
