package com.dev.warehouse.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dev.warehouse.bus.entity.BusItem;
import com.dev.warehouse.bus.service.BusItemService;
import com.dev.warehouse.bus.mapper.BusItemMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【bus_item】的数据库操作Service实现
* @createDate 2022-07-26 15:02:13
*/
@Service
public class BusItemServiceImpl extends ServiceImpl<BusItemMapper, BusItem>
    implements BusItemService{

}




