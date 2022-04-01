package org.bwf.study.model;

public class Brand {
    private Integer brandId;

    private String brandName;

    private Integer brandSort;

    private Byte brandEnable;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

    public Byte getBrandEnable() {
        return brandEnable;
    }

    public void setBrandEnable(Byte brandEnable) {
        this.brandEnable = brandEnable;
    }
}