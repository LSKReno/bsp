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
import java.util.Date;
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
     * query by primary key
     */
    public ManManufacturerDto selectByPrimaryKey(Integer primaryKey){
        return CopyUtil.copy(manManufacturerMapper.selectByPrimaryKey(primaryKey),ManManufacturerDto.class);
    }
    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(ManManufacturerDto manManufacturerDto) {
        ManManufacturer manManufacturer = CopyUtil.copy(manManufacturerDto, ManManufacturer.class);
        manManufacturer.setLastUpdateDate(new Date());
        if (StringUtils.isEmpty(manManufacturerDto.getManId())) {
            manManufacturer.setCreationDate(new Date());
            this.insert(manManufacturer);
        } else {
            this.update(manManufacturer);
        }
        return manManufacturer.getManId();
    }

    /**
     * 新增
     */
    private int insert(ManManufacturer manManufacturer) {
        return manManufacturerMapper.insert(manManufacturer);
    }

    /**
     * 更新
     */
    private int update(ManManufacturer manManufacturer) {
        return manManufacturerMapper.updateByPrimaryKeySelective(manManufacturer);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        manManufacturerMapper.deleteByPrimaryKey(id);
    }
}
