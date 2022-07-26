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
    private Integer firstPart;

    /**
     *
     */
    @TableField(value = "second_part")
    private Integer secondPart;

    /**
     * 签订时间
     */
    @TableField(value = "sign_time")
    private Date signTime;

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
    public Integer getFirstPart() {
        return firstPart;
    }

    /**
     * 甲方
     */
    public void setFirstPart(Integer firstPart) {
        this.firstPart = firstPart;
    }

    /**
     *
     */
    public Integer getSecondPart() {
        return secondPart;
    }

    /**
     *
     */
    public void setSecondPart(Integer secondPart) {
        this.secondPart = secondPart;
    }

    /**
     * 签订时间
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 签订时间
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
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
            && (this.getFirstPart() == null ? other.getFirstPart() == null : this.getFirstPart().equals(other.getFirstPart()))
            && (this.getSecondPart() == null ? other.getSecondPart() == null : this.getSecondPart().equals(other.getSecondPart()))
            && (this.getSignTime() == null ? other.getSignTime() == null : this.getSignTime().equals(other.getSignTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFirstPart() == null) ? 0 : getFirstPart().hashCode());
        result = prime * result + ((getSecondPart() == null) ? 0 : getSecondPart().hashCode());
        result = prime * result + ((getSignTime() == null) ? 0 : getSignTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", first_part=").append(firstPart);
        sb.append(", second_part=").append(secondPart);
        sb.append(", sign_time=").append(signTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
