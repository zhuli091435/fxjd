package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CameraEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CameraEquipmentMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CameraEquipment row);

    CameraEquipment selectByPrimaryKey(Integer ID);

    List<CameraEquipment> selectAll();

    int updateByPrimaryKey(CameraEquipment row);
}