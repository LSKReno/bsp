package com.bsp.server.mapper;

import com.bsp.server.domain.ShaShippingAddress;
import com.bsp.server.domain.ShaShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShaShippingAddressMapper {
    long countByExample(ShaShippingAddressExample example);

    int deleteByExample(ShaShippingAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShaShippingAddress record);

    int insertSelective(ShaShippingAddress record);

    ShaShippingAddress selectOneByExample(ShaShippingAddressExample example);

    ShaShippingAddress selectOneByExampleSelective(@Param("example") ShaShippingAddressExample example, @Param("selective") ShaShippingAddress.Column ... selective);

    List<ShaShippingAddress> selectByExampleSelective(@Param("example") ShaShippingAddressExample example, @Param("selective") ShaShippingAddress.Column ... selective);

    List<ShaShippingAddress> selectByExample(ShaShippingAddressExample example);

    ShaShippingAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShaShippingAddress.Column ... selective);

    ShaShippingAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShaShippingAddress record, @Param("example") ShaShippingAddressExample example);

    int updateByExample(@Param("record") ShaShippingAddress record, @Param("example") ShaShippingAddressExample example);

    int updateByPrimaryKeySelective(ShaShippingAddress record);

    int updateByPrimaryKey(ShaShippingAddress record);

    ShaShippingAddress selectByStoId(Integer stoId);
}
