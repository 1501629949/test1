package org.bwf.study.model;

public class Type {
    private Integer typeId;

    private String typeName;

    private Byte typeEnable;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Byte getTypeEnable() {
        return typeEnable;
    }

    public void setTypeEnable(Byte typeEnable) {
        this.typeEnable = typeEnable;
    }
}