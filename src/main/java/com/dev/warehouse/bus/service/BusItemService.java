package com.dev.warehouse.bus.service;

import com.dev.warehouse.bus.entity.BusItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【bus_item】的数据库操作Service
* @createDate 2022-07-26 15:02:13
*/
public interface BusItemService extends IService<BusItem> {
    List<BusItem> all(String itemName);
}
