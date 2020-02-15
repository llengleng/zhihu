package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FavoriteMapper {
    @Select("select id,title,creator_name,creator_avatar,followers,total_count," +
            "question_title,answer_author_name,answer_content,voteup_count,comment_count from t_favorite")
    @Results({
            @Result(id = true,column = "id",javaType = Long.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Long.class),
            @Result(property = "totalCount",column = "total_count",javaType = Long.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteupCount",column = "voteup_count",javaType = Long.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Long.class)
    })
    List<Favorite> geAllFavorites();

    @Select("select id,title,creator_name,creator_avatar,followers,total_count," +
            "question_title,answer_author_name,answer_content,voteup_count,comment_count " +
            "from t_favorite Order by comment_count DESC limit 0,4")
    @Results({
            @Result(id = true,column = "id",javaType = Long.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Long.class),
            @Result(property = "totalCount",column = "total_count",javaType = Long.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteupCount",column = "voteup_count",javaType = Long.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Long.class)
    })
    List<Favorite> getFourFavorites();
}
