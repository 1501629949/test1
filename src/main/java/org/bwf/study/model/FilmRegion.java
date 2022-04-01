package org.bwf.study.model;

public class FilmRegion {
    private Integer filmReId;

    private String filmReName;

    private Byte filmReEnable;

    public Integer getFilmReId() {
        return filmReId;
    }

    public void setFilmReId(Integer filmReId) {
        this.filmReId = filmReId;
    }

    public String getFilmReName() {
        return filmReName;
    }

    public void setFilmReName(String filmReName) {
        this.filmReName = filmReName == null ? null : filmReName.trim();
    }

    public Byte getFilmReEnable() {
        return filmReEnable;
    }

    public void setFilmReEnable(Byte filmReEnable) {
        this.filmReEnable = filmReEnable;
    }
}