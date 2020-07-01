package com.bsp.server.service;

import com.bsp.server.domain.MorMonitorResult;
import com.bsp.server.domain.MorMonitorResultExample;
import com.bsp.server.dto.MorMonitorResultDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.mapper.MorMonitorResultMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MorMonitorResultService {

    @Resource
    private MorMonitorResultMapper morMonitorResultMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        MorMonitorResultExample morMonitorResultExample = new MorMonitorResultExample();
        List<MorMonitorResult> morMonitorResultList = morMonitorResultMapper.selectByExample(morMonitorResultExample);
        PageInfo<MorMonitorResult> pageInfo = new PageInfo<>(morMonitorResultList);
        pageDto.setTotal(pageInfo.getTotal());
        List<MorMonitorResultDto> morMonitorResultDtoList = CopyUtil.copyList(morMonitorResultList, MorMonitorResultDto.class);
        pageDto.setList(morMonitorResultDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(MorMonitorResultDto morMonitorResultDto) {
        MorMonitorResult morMonitorResult = CopyUtil.copy(morMonitorResultDto, MorMonitorResult.class);
        if (StringUtils.isEmpty(morMonitorResultDto.getMorId())) {
            this.insert(morMonitorResult);
        } else {
            this.update(morMonitorResult);
        }
    }

    /**
     * 新增
     */
    private void insert(MorMonitorResult morMonitorResult) {
        morMonitorResultMapper.insert(morMonitorResult);
    }

    /**
     * 更新
     */
    private void update(MorMonitorResult morMonitorResult) {
        morMonitorResultMapper.updateByPrimaryKey(morMonitorResult);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        morMonitorResultMapper.deleteByPrimaryKey(id);
    }
}
