package org.bwf.study.model;

public class SpecialHall {
    private Integer specialId;

    private String specialName;

    private Integer specialSort;

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName == null ? null : specialName.trim();
    }

    public Integer getSpecialSort() {
        return specialSort;
    }

    public void setSpecialSort(Integer specialSort) {
        this.specialSort = specialSort;
    }
}