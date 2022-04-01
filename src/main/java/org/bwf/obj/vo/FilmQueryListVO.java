package org.bwf.obj.vo;

import org.bwf.obj.bo.FilmQueryBO;
import org.bwf.study.model.Category;
import org.bwf.study.model.Film;
import org.bwf.study.model.FilmRegion;

import java.util.List;

public class FilmQueryListVO {
    private List<Category> categories;
    private List<FilmRegion> filmRegions;
    private List<Film> films;
    private FilmQueryBO bo;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<FilmRegion> getFilmRegions() {
        return filmRegions;
    }

    public void setFilmRegions(List<FilmRegion> filmRegions) {
        this.filmRegions = filmRegions;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public FilmQueryBO getBo() {
        return bo;
    }

    public void setBo(FilmQueryBO bo) {
        this.bo = bo;
    }
}
