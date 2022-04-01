package org.bwf.obj.vo;

import org.bwf.obj.bo.CinemaQueryListBO;
import org.bwf.study.model.Brand;
import org.bwf.study.model.Cinema;
import org.bwf.study.model.SpecialHall;

import java.util.List;

public class CinemaQueryListVO {
    private List<Brand> brands;
    private List<SpecialHall> specialHalls;
    private List<Cinema> cinemas;
    private CinemaQueryListBO bo;

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<SpecialHall> getSpecialHalls() {
        return specialHalls;
    }

    public void setSpecialHalls(List<SpecialHall> specialHalls) {
        this.specialHalls = specialHalls;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public CinemaQueryListBO getBo() {
        return bo;
    }

    public void setBo(CinemaQueryListBO bo) {
        this.bo = bo;
    }
}
