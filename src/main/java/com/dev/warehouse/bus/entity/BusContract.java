package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

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
    private Integer first_part;

    /**
     * 
     */
    @TableField(value = "second_part")
    private Integer second_part;

    /**
     * 签订时间
     */
    @TableField(value = "sign_time")
    private Date sign_time;

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
    public Integer getFirst_part() {
        return first_part;
    }

    /**
     * 甲方
     */
    public void setFirst_part(Integer first_part) {
        this.first_part = first_part;
    }

    /**
     * 
     */
    public Integer getSecond_part() {
        return second_part;
    }

    /**
     * 
     */
    public void setSecond_part(Integer second_part) {
        this.second_part = second_part;
    }

    /**
     * 签订时间
     */
    public Date getSign_time() {
        return sign_time;
    }

    /**
     * 签订时间
     */
    public void setSign_time(Date sign_time) {
        this.sign_time = sign_time;
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
        BusContract other = (BusContract) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFirst_part() == null ? other.getFirst_part() == null : this.getFirst_part().equals(other.getFirst_part()))
            && (this.getSecond_part() == null ? other.getSecond_part() == null : this.getSecond_part().equals(other.getSecond_part()))
            && (this.getSign_time() == null ? other.getSign_time() == null : this.getSign_time().equals(other.getSign_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFirst_part() == null) ? 0 : getFirst_part().hashCode());
        result = prime * result + ((getSecond_part() == null) ? 0 : getSecond_part().hashCode());
        result = prime * result + ((getSign_time() == null) ? 0 : getSign_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", first_part=").append(first_part);
        sb.append(", second_part=").append(second_part);
        sb.append(", sign_time=").append(sign_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}