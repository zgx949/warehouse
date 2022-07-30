package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName bus_finance
 */
@TableName(value ="bus_finance")
public class BusFinance implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目ID
     */
    @TableField(value = "item_id")
    private Integer itemId;

    /**
     * 客户编号
     */
    @TableField(value = "customer_id")
    private Integer customerId;

    /**
     * 供应商ID
     */
    @TableField(value = "provider_id")
    private Integer providerId;

    /**
     * 总金额
     */
    @TableField(value = "total_price")
    private Double totalPrice;

    /**
     * 预支付
     */
    @TableField(value = "pre_pay")
    private Double prePay;

    /**
     * 
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getPrePay() {
        return prePay;
    }

    public void setPrePay(Double prePay) {
        this.prePay = prePay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}