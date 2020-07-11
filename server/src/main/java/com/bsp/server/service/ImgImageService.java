package com.bsp.server.service;

import com.bsp.server.domain.ImgImageExample;
import com.bsp.server.dto.ImgImageDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.ImgImage;
import com.bsp.server.mapper.ImgImageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ImgImageService {

    @Resource
    private ImgImageMapper imgImageMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        ImgImageExample imgImageExample = new ImgImageExample();
        List<ImgImage> imgImageList = imgImageMapper.selectByExample(imgImageExample);
        PageInfo<ImgImage> pageInfo = new PageInfo<>(imgImageList);
        pageDto.setTotal(pageInfo.getTotal());
        List<ImgImageDto> imgImageDtoList = CopyUtil.copyList(imgImageList, ImgImageDto.class);
        pageDto.setList(imgImageDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(ImgImageDto imgImageDto) {
        ImgImage imgImage = CopyUtil.copy(imgImageDto, ImgImage.class);
        if (StringUtils.isEmpty(imgImageDto.getImgId())) {
            this.insert(imgImage);
        } else {
            this.update(imgImage);
        }
    }

    /**
     * 新增
     */
    private void insert(ImgImage imgImage) {
        imgImageMapper.insert(imgImage);
    }

    public int insertSelective(Map<String,Object> mp) {
        return imgImageMapper.insertSelective(mp);
    }

    /**
     * 更新
     */
    private void update(ImgImage imgImage) {
        imgImageMapper.updateByPrimaryKey(imgImage);
    }

    public int updateSelective(Map<String,Object> mp) {
        return imgImageMapper.updateSelective(mp);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        imgImageMapper.deleteByPrimaryKey(id);
    }
}
