package org.bwf.study.model;

public class WatchDays {
    private Integer wdId;

    private String wdDate;

    private Integer cmaId;

    private Integer filmId;

    private Byte wdEnable;

    public Integer getWdId() {
        return wdId;
    }

    public void setWdId(Integer wdId) {
        this.wdId = wdId;
    }

    public String getWdDate() {
        return wdDate;
    }

    public void setWdDate(String wdDate) {
        this.wdDate = wdDate == null ? null : wdDate.trim();
    }

    public Integer getCmaId() {
        return cmaId;
    }

    public void setCmaId(Integer cmaId) {
        this.cmaId = cmaId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Byte getWdEnable() {
        return wdEnable;
    }

    public void setWdEnable(Byte wdEnable) {
        this.wdEnable = wdEnable;
    }
}