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
    private Integer item_id;

    /**
     * 客户编号
     */
    @TableField(value = "customer_id")
    private Integer customer_id;

    /**
     * 供应商ID
     */
    @TableField(value = "provider_id")
    private Integer provider_id;

    /**
     * 总金额
     */
    @TableField(value = "total_price")
    private Double total_price;

    /**
     * 预支付
     */
    @TableField(value = "pre_pay")
    private Double pre_pay;

    /**
     * 
     */
    @TableField(value = "create_time")
    private Date create_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 项目ID
     */
    public Integer getItem_id() {
        return item_id;
    }

    /**
     * 项目ID
     */
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    /**
     * 客户编号
     */
    public Integer getCustomer_id() {
        return customer_id;
    }

    /**
     * 客户编号
     */
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * 供应商ID
     */
    public Integer getProvider_id() {
        return provider_id;
    }

    /**
     * 供应商ID
     */
    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    /**
     * 总金额
     */
    public Double getTotal_price() {
        return total_price;
    }

    /**
     * 总金额
     */
    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    /**
     * 预支付
     */
    public Double getPre_pay() {
        return pre_pay;
    }

    /**
     * 预支付
     */
    public void setPre_pay(Double pre_pay) {
        this.pre_pay = pre_pay;
    }

    /**
     * 
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * 
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BusFinance other = (BusFinance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getCustomer_id() == null ? other.getCustomer_id() == null : this.getCustomer_id().equals(other.getCustomer_id()))
            && (this.getProvider_id() == null ? other.getProvider_id() == null : this.getProvider_id().equals(other.getProvider_id()))
            && (this.getTotal_price() == null ? other.getTotal_price() == null : this.getTotal_price().equals(other.getTotal_price()))
            && (this.getPre_pay() == null ? other.getPre_pay() == null : this.getPre_pay().equals(other.getPre_pay()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getCustomer_id() == null) ? 0 : getCustomer_id().hashCode());
        result = prime * result + ((getProvider_id() == null) ? 0 : getProvider_id().hashCode());
        result = prime * result + ((getTotal_price() == null) ? 0 : getTotal_price().hashCode());
        result = prime * result + ((getPre_pay() == null) ? 0 : getPre_pay().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", item_id=").append(item_id);
        sb.append(", customer_id=").append(customer_id);
        sb.append(", provider_id=").append(provider_id);
        sb.append(", total_price=").append(total_price);
        sb.append(", pre_pay=").append(pre_pay);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}