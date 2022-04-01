package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Film;
import org.bwf.study.model.FilmExample;
import org.bwf.study.model.FilmWithBLOBs;

public interface FilmMapper {
    long countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(Integer filmId);

    int insert(FilmWithBLOBs record);

    int insertSelective(FilmWithBLOBs record);

    List<FilmWithBLOBs> selectByExampleWithBLOBs(FilmExample example);

    List<Film> selectByExample(FilmExample example);

    FilmWithBLOBs selectByPrimaryKey(Integer filmId);

    int updateByExampleSelective(@Param("record") FilmWithBLOBs record, @Param("example") FilmExample example);

    int updateByExampleWithBLOBs(@Param("record") FilmWithBLOBs record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(FilmWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FilmWithBLOBs record);

    int updateByPrimaryKey(Film record);
}