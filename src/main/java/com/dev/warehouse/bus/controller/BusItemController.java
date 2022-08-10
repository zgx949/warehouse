package com.dev.warehouse.bus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dev.warehouse.bus.mapper.BusItemMapper;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Resource
    private BusItemMapper busItemMapper;

    /**
     * 跳转到項目管理页面
     * @return
     */
    @RequestMapping(value = "toItemManager", method=RequestMethod.GET)
    public ModelAndView toItemManager(){
        ModelAndView mv = new ModelAndView("business/item/item");
        return mv;
    }

    /**
     * 跳转到未完成管理页面
     * @return
     */
    @RequestMapping(value = "toUnfinishedItemManager", method=RequestMethod.GET)
    public ModelAndView toUnfinishedItemManager(){
        ModelAndView mv = new ModelAndView("business/item/unfinishedItem");
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
    public R selectAll(Page<BusItem> page, String itemName) {
        return success(busItemService.all(itemName));
    }

    /**
     * 未完成的数据
     * */
    @GetMapping("unfinished")
    public R selectUnfinished(Page<BusItem> page, BusItem busItem) {
        // 未完成的status为0
        return success(busItemMapper.unfinished());
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

    /*
    * 点击完成
    * */
    @GetMapping("done/{id}")
    public ModelAndView doneOne( @PathVariable Serializable id) {
        success(this.busItemMapper.done(Integer.valueOf(id.toString())));
        return new ModelAndView("business/item/markdone");
    }


    /**
     * 新增数据
     *
     * @param busItem 实体对象
     * @return 新增结果
     */
    @RequestMapping("add")
    public R insert(BusItem busItem) {
        try {
            busItem.setStatus(0);
            return success(this.busItemService.save(busItem));
        } catch (Exception e) {
            return failed(e.toString());
        }
    }

    /**
     * 修改数据
     *
     * @param busItem 实体对象
     * @return 修改结果
     */
    @RequestMapping("update")
    public R update( BusItem busItem) {
        return success(this.busItemService.updateById(busItem));
    }

    /**
     * 删除数据
     *
     * @param id 主键结合
     * @return 删除结果
     */
    @PostMapping
    public R delete(int id) {
        return success(this.busItemService.removeById(id));
    }
}

