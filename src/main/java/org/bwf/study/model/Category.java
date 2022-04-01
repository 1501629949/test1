package org.bwf.study.model;

public class Category {
    private Integer cateId;

    private String cateName;

    private Byte cateEnable;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public Byte getCateEnable() {
        return cateEnable;
    }

    public void setCateEnable(Byte cateEnable) {
        this.cateEnable = cateEnable;
    }
}