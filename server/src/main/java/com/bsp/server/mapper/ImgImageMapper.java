package com.bsp.server.mapper;

import com.bsp.server.domain.ImgImage;
import com.bsp.server.domain.ImgImageExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ImgImageMapper {
    long countByExample(ImgImageExample example);

    int deleteByExample(ImgImageExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ImgImage record);

    int insertSelective(ImgImage record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    ImgImage selectOneByExample(ImgImageExample example);

    ImgImage selectOneByExampleSelective(@Param("example") ImgImageExample example, @Param("selective") ImgImage.Column ... selective);

    List<ImgImage> selectByExampleSelective(@Param("example") ImgImageExample example, @Param("selective") ImgImage.Column ... selective);

    List<ImgImage> selectByExample(ImgImageExample example);

    ImgImage selectByPrimaryKeySelective(@Param("imgId") Integer imgId, @Param("selective") ImgImage.Column ... selective);

    ImgImage selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ImgImage record, @Param("example") ImgImageExample example);

    int updateByExample(@Param("record") ImgImage record, @Param("example") ImgImageExample example);

    int updateByPrimaryKeySelective(ImgImage record);

    int updateByPrimaryKeySelective(Map<String,Object> mp); //根据map更新

    int updateByPrimaryKey(ImgImage record);
}