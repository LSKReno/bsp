package com.bsp.server.service;

import com.bsp.server.domain.SysAndorra;
import com.bsp.server.domain.SysAndorraExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SysAndorraDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.SysAndorraMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;

@Service
public class SysAndorraService {

    @Resource
    private SysAndorraMapper sysAndorraMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysAndorraExample sysAndorraExample = new SysAndorraExample();
        List<SysAndorra> sysAndorraList = sysAndorraMapper.selectByExample(sysAndorraExample);
        PageInfo<SysAndorra> pageInfo = new PageInfo<>(sysAndorraList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysAndorraDto> sysAndorraDtoList = CopyUtil.copyList(sysAndorraList, SysAndorraDto.class);
        pageDto.setList(sysAndorraDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SysAndorraDto sysAndorraDto) {
        SysAndorra sysAndorra = CopyUtil.copy(sysAndorraDto, SysAndorra.class);
        if (StringUtils.isEmpty(sysAndorraDto.getId())) {
            this.insert(sysAndorra);
        } else {
            this.update(sysAndorra);
        }
    }

    /**
     * 新增
     */
    private void insert(SysAndorra sysAndorra) {
        Date now = new Date();
        sysAndorraMapper.insert(sysAndorra);
    }

    /**
     * 更新
     */
    private void update(SysAndorra sysAndorra) {
        sysAndorraMapper.updateByPrimaryKey(sysAndorra);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysAndorraMapper.deleteByPrimaryKey(id);
    }
}
