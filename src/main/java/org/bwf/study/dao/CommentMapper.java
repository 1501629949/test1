package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Comment;
import org.bwf.study.model.CommentExample;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer cmmtId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cmmtId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}