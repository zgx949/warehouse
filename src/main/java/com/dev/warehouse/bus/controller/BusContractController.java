package com.dev.warehouse.bus.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.warehouse.bus.entity.BusContract;
import com.dev.warehouse.bus.service.BusContractService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 合同(BusContract)表控制层
 *
 * @author makejava
 * @since 2022-07-26 15:14:55
 */
@RestController
@RequestMapping("busContract")
public class BusContractController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BusContractService busContractService;
    /*
     * 合同管理页面
     * */
    @RequestMapping("toContractManager")
    public ModelAndView toFinanceManager() {
        return new ModelAndView("business/contract/contract");
    }
    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param busContract 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<BusContract> page, BusContract busContract) {
        return success(this.busContractService.page(page, new QueryWrapper<>(busContract)).getRecords());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.busContractService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param busContract 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody BusContract busContract) {
        return success(this.busContractService.save(busContract));
    }

    /**
     * 修改数据
     *
     * @param busContract 实体对象
     * @return 修改结果
     */
    @RequestMapping("update")
    public R update(BusContract busContract) {
        return success(this.busContractService.updateById(busContract));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.busContractService.removeByIds(idList));
    }
}

