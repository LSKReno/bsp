package com.bsp.server.mapper;

import com.bsp.server.domain.BrdBrand;
import com.bsp.server.domain.BrdBrandExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrdBrandMapper {
    long countByExample(BrdBrandExample example);

    int deleteByExample(BrdBrandExample example);

    int deleteByPrimaryKey(Integer brdId);

    int insert(BrdBrand record);

    int insertSelective(BrdBrand record);

    BrdBrand selectOneByExample(BrdBrandExample example);

    BrdBrand selectOneByExampleSelective(@Param("example") BrdBrandExample example, @Param("selective") BrdBrand.Column ... selective);

    List<BrdBrand> selectByExampleSelective(@Param("example") BrdBrandExample example, @Param("selective") BrdBrand.Column ... selective);

    List<BrdBrand> selectByExample(BrdBrandExample example);

    List<BrdBrand> selectByCompanyId(Integer manId);

    BrdBrand selectByPrimaryKeySelective(@Param("brdId") Integer brdId, @Param("selective") BrdBrand.Column ... selective);

    BrdBrand selectByPrimaryKey(Integer brdId);

    int updateByExampleSelective(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByExample(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByPrimaryKeySelective(BrdBrand record);

    int updateByPrimaryKey(BrdBrand record);
}
