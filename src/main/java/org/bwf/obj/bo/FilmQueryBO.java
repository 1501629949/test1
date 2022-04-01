package org.bwf.obj.bo;

import org.bwf.obj.BaseObj;

public class FilmQueryBO extends BaseObj {
    private Integer cateId;
    private Integer regionId;
    private String  years;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
}
