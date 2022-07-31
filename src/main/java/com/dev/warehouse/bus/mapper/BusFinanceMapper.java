package com.dev.warehouse.bus.mapper;

import com.dev.warehouse.bus.entity.BusFinance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【bus_finance】的数据库操作Mapper
* @createDate 2022-07-26 15:01:57
* @Entity com.dev.warehouse.bus.entity.BusFinance
*/
public interface BusFinanceMapper extends BaseMapper<BusFinance> {
    List<BusFinance> all();
}




