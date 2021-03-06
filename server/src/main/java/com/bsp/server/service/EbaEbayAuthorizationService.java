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
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    public int save(EbaEbayAuthorizationDto ebaEbayAuthorizationDto) {
        EbaEbayAuthorization ebaEbayAuthorization = CopyUtil.copy(ebaEbayAuthorizationDto, EbaEbayAuthorization.class);
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 3);
        ebaEbayAuthorization.setLastUpdateDate(date);
        ebaEbayAuthorization.setExpDate(calendar.getTime());
        ebaEbayAuthorization.setCancleDate(calendar.getTime());
        if (StringUtils.isEmpty(ebaEbayAuthorizationDto.getEbaId())) {
            ebaEbayAuthorization.setCreationDate(date);
            return this.insert(ebaEbayAuthorization);
        } else {
            return this.update(ebaEbayAuthorization);
        }
    }

    /**
     * 新增
     */
    private int insert(EbaEbayAuthorization ebaEbayAuthorization) {
        Date now = new Date();
        return ebaEbayAuthorizationMapper.insert(ebaEbayAuthorization);
    }

    /**
     * 更新
     */
    private int update(EbaEbayAuthorization ebaEbayAuthorization) {
        return ebaEbayAuthorizationMapper.updateByPrimaryKeySelective(ebaEbayAuthorization);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        ebaEbayAuthorizationMapper.deleteByPrimaryKey(id);
    }
}
