package org.bwf.study.model;

public class Regions {
    private Integer regionId;

    private String regionName;

    private Integer regionParentid;

    private Byte regionEnable;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Integer getRegionParentid() {
        return regionParentid;
    }

    public void setRegionParentid(Integer regionParentid) {
        this.regionParentid = regionParentid;
    }

    public Byte getRegionEnable() {
        return regionEnable;
    }

    public void setRegionEnable(Byte regionEnable) {
        this.regionEnable = regionEnable;
    }
}