package com.bsp.server.service;

import com.bsp.server.dto.DsrDropshipperDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.domain.DsrDropshipperExample;
import com.bsp.server.mapper.DsrDropshipperMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DsrDropshipperService {

    @Resource
    private DsrDropshipperMapper dsrDropshipperMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        DsrDropshipperExample dsrDropshipperExample = new DsrDropshipperExample();
        List<DsrDropshipper> dsrDropshipperList = dsrDropshipperMapper.selectByExample(dsrDropshipperExample);
        PageInfo<DsrDropshipper> pageInfo = new PageInfo<>(dsrDropshipperList);
        pageDto.setTotal(pageInfo.getTotal());
        List<DsrDropshipperDto> dsrDropshipperDtoList = CopyUtil.copyList(dsrDropshipperList, DsrDropshipperDto.class);
        pageDto.setList(dsrDropshipperDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(DsrDropshipperDto dsrDropshipperDto) {
        DsrDropshipper dsrDropshipper = CopyUtil.copy(dsrDropshipperDto, DsrDropshipper.class);
        if (StringUtils.isEmpty(dsrDropshipperDto.getDsrId())) {
            this.insert(dsrDropshipper);
        } else {
            this.update(dsrDropshipper);
        }
    }

    /**
     * 新增
     */
    private void insert(DsrDropshipper dsrDropshipper) {
        dsrDropshipperMapper.insert(dsrDropshipper);
    }

    /**
     * 更新
     */
    private void update(DsrDropshipper dsrDropshipper) {
        dsrDropshipperMapper.updateByPrimaryKey(dsrDropshipper);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        dsrDropshipperMapper.deleteByPrimaryKey(id);
    }
}
