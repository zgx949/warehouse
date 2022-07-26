package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName bus_item
 */
@TableName(value ="bus_item")
public class BusItem implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    @TableField(value = "item_name")
    private String item_name;

    /**
     * 客户ID
     */
    @TableField(value = "customer_id")
    private Integer customer_id;

    /**
     * 供应商ID
     */
    @TableField(value = "provider_id")
    private Integer provider_id;

    /**
     * 订单ID
     */
    @TableField(value = "sales_id")
    private Integer sales_id;

    /**
     * 资金情况
     */
    @TableField(value = "capital_status")
    private String capital_status;

    /**
     * 合同编号
     */
    @TableField(value = "contract_id")
    private Integer contract_id;

    /**
     * 状态：完成1，未完成0，异常-1
     */
    @TableField(value = "status")
    private Integer status;

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
     * 项目名称
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * 项目名称
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * 客户ID
     */
    public Integer getCustomer_id() {
        return customer_id;
    }

    /**
     * 客户ID
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
     * 订单ID
     */
    public Integer getSales_id() {
        return sales_id;
    }

    /**
     * 订单ID
     */
    public void setSales_id(Integer sales_id) {
        this.sales_id = sales_id;
    }

    /**
     * 资金情况
     */
    public String getCapital_status() {
        return capital_status;
    }

    /**
     * 资金情况
     */
    public void setCapital_status(String capital_status) {
        this.capital_status = capital_status;
    }

    /**
     * 合同编号
     */
    public Integer getContract_id() {
        return contract_id;
    }

    /**
     * 合同编号
     */
    public void setContract_id(Integer contract_id) {
        this.contract_id = contract_id;
    }

    /**
     * 状态：完成1，未完成0，异常-1
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：完成1，未完成0，异常-1
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        BusItem other = (BusItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_name() == null ? other.getItem_name() == null : this.getItem_name().equals(other.getItem_name()))
            && (this.getCustomer_id() == null ? other.getCustomer_id() == null : this.getCustomer_id().equals(other.getCustomer_id()))
            && (this.getProvider_id() == null ? other.getProvider_id() == null : this.getProvider_id().equals(other.getProvider_id()))
            && (this.getSales_id() == null ? other.getSales_id() == null : this.getSales_id().equals(other.getSales_id()))
            && (this.getCapital_status() == null ? other.getCapital_status() == null : this.getCapital_status().equals(other.getCapital_status()))
            && (this.getContract_id() == null ? other.getContract_id() == null : this.getContract_id().equals(other.getContract_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_name() == null) ? 0 : getItem_name().hashCode());
        result = prime * result + ((getCustomer_id() == null) ? 0 : getCustomer_id().hashCode());
        result = prime * result + ((getProvider_id() == null) ? 0 : getProvider_id().hashCode());
        result = prime * result + ((getSales_id() == null) ? 0 : getSales_id().hashCode());
        result = prime * result + ((getCapital_status() == null) ? 0 : getCapital_status().hashCode());
        result = prime * result + ((getContract_id() == null) ? 0 : getContract_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", item_name=").append(item_name);
        sb.append(", customer_id=").append(customer_id);
        sb.append(", provider_id=").append(provider_id);
        sb.append(", sales_id=").append(sales_id);
        sb.append(", capital_status=").append(capital_status);
        sb.append(", contract_id=").append(contract_id);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}