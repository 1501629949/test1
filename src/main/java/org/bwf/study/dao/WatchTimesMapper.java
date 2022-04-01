package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.WatchTimes;
import org.bwf.study.model.WatchTimesExample;

public interface WatchTimesMapper {
    long countByExample(WatchTimesExample example);

    int deleteByExample(WatchTimesExample example);

    int deleteByPrimaryKey(String wtId);

    int insert(WatchTimes record);

    int insertSelective(WatchTimes record);

    List<WatchTimes> selectByExampleWithBLOBs(WatchTimesExample example);

    List<WatchTimes> selectByExample(WatchTimesExample example);

    WatchTimes selectByPrimaryKey(String wtId);

    int updateByExampleSelective(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByExampleWithBLOBs(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByExample(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByPrimaryKeySelective(WatchTimes record);

    int updateByPrimaryKeyWithBLOBs(WatchTimes record);

    int updateByPrimaryKey(WatchTimes record);
}