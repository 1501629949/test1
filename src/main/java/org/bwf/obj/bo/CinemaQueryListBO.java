package org.bwf.obj.bo;

import org.bwf.obj.BaseObj;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

public class CinemaQueryListBO extends BaseObj {
    private Integer brandId;
    private Integer specialHallId;
    private Integer serviceId;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSpecialHallId() {
        return specialHallId;
    }

    public void setSpecialHallId(Integer specialHallId) {
        this.specialHallId = specialHallId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "CinemaQueryListBO{" +
                "currentIndex=" + currentIndex +
                ", pageSize=" + pageSize +
                ", orderCol='" + orderCol + '\'' +
                ", orderDAC='" + orderDAC + '\'' +
                ", brandId=" + brandId +
                ", specialHallId=" + specialHallId +
                ", serviceId=" + serviceId +
                '}';
    }
}
