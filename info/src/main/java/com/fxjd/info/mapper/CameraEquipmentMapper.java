package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CameraEquipment;
import com.fxjd.info.pojo.CameraEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CameraEquipmentMapper {
    long countByExample(CameraEquipmentExample example);

    int deleteByExample(CameraEquipmentExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(CameraEquipment row);

    int insertSelective(CameraEquipment row);

    List<CameraEquipment> selectByExample(CameraEquipmentExample example);

    CameraEquipment selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") CameraEquipment row, @Param("example") CameraEquipmentExample example);

    int updateByExample(@Param("row") CameraEquipment row, @Param("example") CameraEquipmentExample example);

    int updateByPrimaryKeySelective(CameraEquipment row);

    int updateByPrimaryKey(CameraEquipment row);
}