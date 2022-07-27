package com.dev.warehouse.bus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.warehouse.bus.entity.BusItem;
import com.dev.warehouse.bus.service.BusItemService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (BusItem)表控制层
 *
 * @author makejava
 * @since 2022-07-26 15:16:20
 */
@RestController
@RequestMapping("item")
public class BusItemController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BusItemService busItemService;

    /**
     * 跳转到項目管理页面
     * @return
     */
    @RequestMapping(value = "toItemManager", method=RequestMethod.GET)
    public ModelAndView toCustomerManager(){
        ModelAndView mv = new ModelAndView("business/item/item");
        return mv;

    }


    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param busItem 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<BusItem> page, BusItem busItem) {
//        IPage<BusItem> data = this.busItemService.page(page, new QueryWrapper<>(busItem));

//        return success(data.getRecords());
        return success(busItemService.all());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.busItemService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param busItem 实体对象
     * @return 新增结果
     */
    @PostMapping("add")
    public R insert(@RequestBody BusItem busItem) {
        return success(this.busItemService.save(busItem));
    }

    /**
     * 修改数据
     *
     * @param busItem 实体对象
     * @return 修改结果
     */
    @PostMapping("update")
    public R update(@RequestBody BusItem busItem) {
        return success(this.busItemService.updateById(busItem));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.busItemService.removeByIds(idList));
    }
}

