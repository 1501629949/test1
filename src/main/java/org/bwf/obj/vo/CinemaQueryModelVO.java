package org.bwf.obj.vo;

import org.bwf.study.model.Cinema;
import org.bwf.study.model.Film;
import org.bwf.study.model.FilmWithBLOBs;
import org.bwf.study.model.WatchTimes;

import java.util.List;

public class CinemaQueryModelVO {
    private Cinema cinema;
    private List<FilmWithBLOBs> films;

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<FilmWithBLOBs> getFilms() {
        return films;
    }

    public void setFilms(List<FilmWithBLOBs> films) {
        this.films = films;
    }
}
