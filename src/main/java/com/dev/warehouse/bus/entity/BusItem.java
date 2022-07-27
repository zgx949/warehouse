package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.hibernate.validator.internal.util.Contracts;

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
    private String itemName;

    /**
     * 客户ID
     */
    @TableField(value = "customer_id")
    private Integer customerId;
    private Customer customer;

    /**
     * 供应商ID
     */
    @TableField(value = "provider_id")
    private Integer providerId;
    private Provider provider;

    /**
     * 订单ID
     */
    @TableField(value = "sales_id")
    private Integer salesId;
    private Sales sales;

    /**
     * 资金情况
     */
    @TableField(value = "capital_status")
    private String capitalStatus;

    /**
     * 合同编号
     */
    @TableField(value = "contract_id")
    private Integer contractId;
    private BusContract contracts;

    /**
     * 状态：完成1，未完成0，异常-1
     */
    @TableField(value = "status")
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public String getCapitalStatus() {
        return capitalStatus;
    }

    public void setCapitalStatus(String capitalStatus) {
        this.capitalStatus = capitalStatus;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public BusContract getContracts() {
        return contracts;
    }

    public void setContracts(BusContract contracts) {
        this.contracts = contracts;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
