package com.dev.warehouse.bus.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.warehouse.bus.entity.BusFinance;
import com.dev.warehouse.bus.mapper.BusFinanceMapper;
import com.dev.warehouse.bus.service.BusFinanceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (BusFinance)表控制层
 *
 * @author makejava
 * @since 2022-07-26 15:15:45
 */
@RestController
@RequestMapping("busFinance")
public class BusFinanceController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BusFinanceService busFinanceService;

    @Resource
    private BusFinanceMapper busFinanceMapper;
    /*
    * 财务管理页面
    * */
    @RequestMapping("toFinanceManager")
    public ModelAndView toFinanceManager() {
        return new ModelAndView("business/finance/finance");
    }

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param busFinance 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<BusFinance> page, BusFinance busFinance) {
//        return success(this.busFinanceService.page(page, new QueryWrapper<>(busFinance)).getRecords());
        return success(this.busFinanceMapper.all());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.busFinanceService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param busFinance 实体对象
     * @return 新增结果
     */
    @PostMapping("addfinance")
    public R insert(BusFinance busFinance) {
        return success(this.busFinanceService.save(busFinance));
    }

    /**
     * 修改数据
     *
     * @param busFinance 实体对象
     * @return 修改结果
     */
    @PostMapping("updatefinance")
    public R update(BusFinance busFinance) {
        return success(this.busFinanceService.updateById(busFinance));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.busFinanceService.removeByIds(idList));
    }
}

