package com.dev.warehouse.bus.mapper;

import com.dev.warehouse.bus.entity.BusContract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【bus_contract(合同)】的数据库操作Mapper
* @createDate 2022-07-26 15:00:27
* @Entity com.dev.warehouse.bus.entity.BusContract
*/
@Mapper
public interface BusContractMapper extends BaseMapper<BusContract> {

}




