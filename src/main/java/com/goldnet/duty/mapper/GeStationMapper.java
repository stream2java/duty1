package com.goldnet.duty.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.goldnet.duty.entity.GeStation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Max.Huang
* @description 针对表【ge_station(子站信息)】的数据库操作Mapper
* @createDate 2022-03-11 17:43:48
* @Entity com.goldnet.duty.entity.GeStation
*/
@Repository
public interface GeStationMapper extends BaseMapper<GeStation> {

}




