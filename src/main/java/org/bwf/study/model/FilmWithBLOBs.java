package org.bwf.study.model;

import java.util.List;

public class FilmWithBLOBs extends Film {
    private String filmActors;

    private String filmAwards;

    private List<FilmAdvance> filmAdvances;

    private List<FilmImgs> filmImges;

    private List<FilmAttribute> filmAttributes;

    private List<FilmActor> filmActores;

    private List<FilmAward> filmAwardes;

    private List<Comment> comments;

    private List<WatchTimes> watchTimes;

    public String getFilmActors() {
        return filmActors;
    }

    public void setFilmActors(String filmActors) {
        this.filmActors = filmActors == null ? null : filmActors.trim();
    }

    public String getFilmAwards() {
        return filmAwards;
    }

    public void setFilmAwards(String filmAwards) {
        this.filmAwards = filmAwards == null ? null : filmAwards.trim();
    }

    public List<FilmAdvance> getFilmAdvances() {
        return filmAdvances;
    }

    public void setFilmAdvances(List<FilmAdvance> filmAdvances) {
        this.filmAdvances = filmAdvances;
    }

    public List<FilmImgs> getFilmImges() {
        return filmImges;
    }

    public void setFilmImges(List<FilmImgs> filmImges) {
        this.filmImges = filmImges;
    }

    public List<FilmAttribute> getFilmAttributes() {
        return filmAttributes;
    }

    public void setFilmAttributes(List<FilmAttribute> filmAttributes) {
        this.filmAttributes = filmAttributes;
    }

    public List<FilmActor> getFilmActores() {
        return filmActores;
    }

    public void setFilmActores(List<FilmActor> filmActores) {
        this.filmActores = filmActores;
    }

    public List<FilmAward> getFilmAwardes() {
        return filmAwardes;
    }

    public void setFilmAwardes(List<FilmAward> filmAwardes) {
        this.filmAwardes = filmAwardes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<WatchTimes> getWatchTimes() {
        return watchTimes;
    }

    public void setWatchTimes(List<WatchTimes> watchTimes) {
        this.watchTimes = watchTimes;
    }
}