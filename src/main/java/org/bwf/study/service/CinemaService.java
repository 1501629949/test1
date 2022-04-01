package org.bwf.study.service;

import org.bwf.obj.bo.CinemaQueryListBO;
import org.bwf.obj.vo.CinemaQueryListVO;
import org.bwf.obj.vo.CinemaQueryModelVO;

public interface CinemaService {

    CinemaQueryListVO CinemaQueryList (CinemaQueryListBO bo);

    CinemaQueryModelVO CinemaQueryModel (Integer cmaId);
}
