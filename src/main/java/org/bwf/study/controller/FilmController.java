package org.bwf.study.controller;

import org.bwf.obj.bo.FilmQueryBO;
import org.bwf.obj.vo.FilmQueryListVO;
import org.bwf.study.model.FilmWithBLOBs;
import org.bwf.study.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/films/")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public FilmQueryListVO FilmQueryList(FilmQueryBO bo ){
        return filmService.FilmQueryList(bo);
    }

    @GetMapping("{filmId}")
    public FilmWithBLOBs FilmQueryModel(@PathVariable Integer filmId){
        return filmService.FilmQueryModel(filmId);
    }
}
