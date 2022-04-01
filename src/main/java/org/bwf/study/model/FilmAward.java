package org.bwf.study.model;

import java.util.List;

public class FilmAward {
    private String awd_name;
    private String awd_img;
    private List<FilmAwardContent> awd_content;

    public String getAwd_name() {
        return awd_name;
    }

    public void setAwd_name(String awd_name) {
        this.awd_name = awd_name;
    }

    public String getAwd_img() {
        return awd_img;
    }

    public void setAwd_img(String awd_img) {
        this.awd_img = awd_img;
    }

    public List<FilmAwardContent> getAwd_content() {
        return awd_content;
    }

    public void setAwd_content(List<FilmAwardContent> awd_content) {
        this.awd_content = awd_content;
    }
}
