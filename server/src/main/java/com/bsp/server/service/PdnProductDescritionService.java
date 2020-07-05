package com.bsp.server.service;

import com.bsp.server.domain.PdnProductDescritionExample;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.PdnProductDescritionDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.PdnProductDescrition;
import com.bsp.server.mapper.PdnProductDescritionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PdnProductDescritionService {

    @Resource
    private PdnProductDescritionMapper pdnProductDescritionMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        PdnProductDescritionExample pdnProductDescritionExample = new PdnProductDescritionExample();
        List<PdnProductDescrition> pdnProductDescritionList = pdnProductDescritionMapper.selectByExample(pdnProductDescritionExample);
        PageInfo<PdnProductDescrition> pageInfo = new PageInfo<>(pdnProductDescritionList);
        pageDto.setTotal(pageInfo.getTotal());
        List<PdnProductDescritionDto> pdnProductDescritionDtoList = CopyUtil.copyList(pdnProductDescritionList, PdnProductDescritionDto.class);
        pageDto.setList(pdnProductDescritionDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(PdnProductDescritionDto pdnProductDescritionDto) {
        PdnProductDescrition pdnProductDescrition = CopyUtil.copy(pdnProductDescritionDto, PdnProductDescrition.class);
        if (StringUtils.isEmpty(pdnProductDescritionDto.getPdnId())) {
            this.insert(pdnProductDescrition);
        } else {
            this.update(pdnProductDescrition);
        }
    }

    /**
     * 新增
     */
    private void insert(PdnProductDescrition pdnProductDescrition) {
        pdnProductDescritionMapper.insert(pdnProductDescrition);
    }

    public int insertSelective(Map<String,Object> mp) {
        return pdnProductDescritionMapper.insertSelective(mp);
    }


    /**
     * 更新
     */
    private void update(PdnProductDescrition pdnProductDescrition) {
        pdnProductDescritionMapper.updateByPrimaryKey(pdnProductDescrition);
    }

    public int updateSelective(Map<String,Object> mp) {
        return pdnProductDescritionMapper.updateSelective(mp);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        pdnProductDescritionMapper.deleteByPrimaryKey(id);
    }
}
