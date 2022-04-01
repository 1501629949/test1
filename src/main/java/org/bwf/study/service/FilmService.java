package org.bwf.study.service;

import org.bwf.obj.bo.FilmQueryBO;
import org.bwf.obj.vo.FilmQueryListVO;
import org.bwf.study.model.FilmWithBLOBs;

public interface FilmService {

    // 多条件查询列表
    FilmQueryListVO FilmQueryList (FilmQueryBO bo);

    // 电影详情
    FilmWithBLOBs FilmQueryModel (Integer filmId);
}
