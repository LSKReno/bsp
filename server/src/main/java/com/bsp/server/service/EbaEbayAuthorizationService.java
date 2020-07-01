package com.bsp.server.service;

import com.bsp.server.domain.EbaEbayAuthorizationExample;
import com.bsp.server.dto.EbaEbayAuthorizationDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.EbaEbayAuthorization;
import com.bsp.server.mapper.EbaEbayAuthorizationMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;

@Service
public class EbaEbayAuthorizationService {

    @Resource
    private EbaEbayAuthorizationMapper ebaEbayAuthorizationMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        EbaEbayAuthorizationExample ebaEbayAuthorizationExample = new EbaEbayAuthorizationExample();
        List<EbaEbayAuthorization> ebaEbayAuthorizationList = ebaEbayAuthorizationMapper.selectByExample(ebaEbayAuthorizationExample);
        PageInfo<EbaEbayAuthorization> pageInfo = new PageInfo<>(ebaEbayAuthorizationList);
        pageDto.setTotal(pageInfo.getTotal());
        List<EbaEbayAuthorizationDto> ebaEbayAuthorizationDtoList = CopyUtil.copyList(ebaEbayAuthorizationList, EbaEbayAuthorizationDto.class);
        pageDto.setList(ebaEbayAuthorizationDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(EbaEbayAuthorizationDto ebaEbayAuthorizationDto) {
        EbaEbayAuthorization ebaEbayAuthorization = CopyUtil.copy(ebaEbayAuthorizationDto, EbaEbayAuthorization.class);
        if (StringUtils.isEmpty(ebaEbayAuthorizationDto.getEbaId())) {
            this.insert(ebaEbayAuthorization);
        } else {
            this.update(ebaEbayAuthorization);
        }
    }

    /**
     * 新增
     */
    private void insert(EbaEbayAuthorization ebaEbayAuthorization) {
        Date now = new Date();
        ebaEbayAuthorizationMapper.insert(ebaEbayAuthorization);
    }

    /**
     * 更新
     */
    private void update(EbaEbayAuthorization ebaEbayAuthorization) {
        ebaEbayAuthorizationMapper.updateByPrimaryKey(ebaEbayAuthorization);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        ebaEbayAuthorizationMapper.deleteByPrimaryKey(id);
    }
}
