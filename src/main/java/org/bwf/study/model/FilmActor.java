package org.bwf.study.model;

import java.util.List;

public class FilmActor {
    private String act_job;
    private List<FilmActorContent> content;

    public String getAct_job() {
        return act_job;
    }

    public void setAct_job(String act_job) {
        this.act_job = act_job;
    }

    public List<FilmActorContent> getContent() {
        return content;
    }

    public void setContent(List<FilmActorContent> content) {
        this.content = content;
    }
}
