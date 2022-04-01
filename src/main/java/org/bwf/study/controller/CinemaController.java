package org.bwf.study.controller;

import org.bwf.obj.bo.CinemaQueryListBO;
import org.bwf.study.service.CinemaService;
import org.bwf.study.util.returnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;

@RestController
@RequestMapping("api/cinemas/")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public returnInfo CinemaQueryList(CinemaQueryListBO bo){
        returnInfo returnInfo = new returnInfo(cinemaService.CinemaQueryList(bo));
        return returnInfo;
    }

    @GetMapping("{cmaId}")
    public returnInfo CinemaQueryModel(@PathVariable Integer cmaId){
        returnInfo returnInfo = new returnInfo(cinemaService.CinemaQueryModel(cmaId));
        return returnInfo;
    }
}
