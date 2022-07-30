package com.dev.warehouse.bus.mapper;

import com.dev.warehouse.bus.entity.BusItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【bus_item】的数据库操作Mapper
* @createDate 2022-07-26 15:02:13
* @Entity com.dev.warehouse.bus.entity.BusItem
*/
public interface BusItemMapper extends BaseMapper<BusItem> {
    List<BusItem> all();
    List<BusItem> unfinished();
    int done(int id);
}




