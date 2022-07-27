package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 合同
 * @TableName bus_contract
 */
@TableName(value ="bus_contract")
public class BusContract implements Serializable {
    /**
     * 合同编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 甲方
     */
    @TableField(value = "first_part")
    private String firstPart;

    /**
     *
     */
    @TableField(value = "second_part")
    private String secondPart;

    /**
     * 签订时间
     */
    @TableField(value = "sign_time")
    private String signTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 合同编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 合同编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 甲方
     */
    public String getFirstPart() {
        return firstPart;
    }

    /**
     * 甲方
     */
    public void setFirstPart(String firstPart) {
        this.firstPart = firstPart;
    }

    /**
     *
     */
    public String getSecondPart() {
        return secondPart;
    }

    /**
     *
     */
    public void setSecondPart(String secondPart) {
        this.secondPart = secondPart;
    }

    /**
     * 签订时间
     */
    public String getSignTime() {
        return signTime;
    }

    /**
     * 签订时间
     */
    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

}
