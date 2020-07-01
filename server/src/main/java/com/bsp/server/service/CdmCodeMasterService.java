package com.bsp.server.service;

import com.bsp.server.domain.CdmCodeMaster;
import com.bsp.server.domain.CdmCodeMasterExample;
import com.bsp.server.dto.CdmCodeMasterDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.CdmCodeMasterMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CdmCodeMasterService {

    @Resource
    private CdmCodeMasterMapper cdmCodeMasterMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        CdmCodeMasterExample cdmCodeMasterExample = new CdmCodeMasterExample();
        List<CdmCodeMaster> cdmCodeMasterList = cdmCodeMasterMapper.selectByExample(cdmCodeMasterExample);
        PageInfo<CdmCodeMaster> pageInfo = new PageInfo<>(cdmCodeMasterList);
        pageDto.setTotal(pageInfo.getTotal());
        List<CdmCodeMasterDto> cdmCodeMasterDtoList = CopyUtil.copyList(cdmCodeMasterList, CdmCodeMasterDto.class);
        pageDto.setList(cdmCodeMasterDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(CdmCodeMasterDto cdmCodeMasterDto) {
        CdmCodeMaster cdmCodeMaster = CopyUtil.copy(cdmCodeMasterDto, CdmCodeMaster.class);
        if (StringUtils.isEmpty(cdmCodeMasterDto.getCdmId())) {
            this.insert(cdmCodeMaster);
        } else {
            this.update(cdmCodeMaster);
        }
    }

    /**
     * 新增
     */
    private void insert(CdmCodeMaster cdmCodeMaster) {
        cdmCodeMasterMapper.insert(cdmCodeMaster);
    }

    /**
     * 更新
     */
    private void update(CdmCodeMaster cdmCodeMaster) {
        cdmCodeMasterMapper.updateByPrimaryKey(cdmCodeMaster);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        cdmCodeMasterMapper.deleteByPrimaryKey(id);
    }
}
