package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.ColumnItem;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ColumnMapper {
    /**
     * 查找所有栏目数据
     * @return
     */
    @Select(" SELECT id,title,description,url,image_url,followers,articles_count FROM t_columns ")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Long.class),
            @Result(property = "title",column = "title",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "description",column = "description",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "url",column = "url",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "followers",column = "followers",jdbcType = JdbcType.INTEGER,javaType = Long.class),
            @Result(property = "articlesCount",column = "articles_count",jdbcType = JdbcType.INTEGER,javaType = Long.class)
    })
    List<ColumnItem> getAllColumns();

    /**
     * 查询前4个栏目
     */
    @Select("SELECT id,title,description,url,image_url,followers,articles_count FROM t_columns ORDER BY followers DESC LIMIT 0,4")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Long.class),
            @Result(property = "title",column = "title",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "description",column = "description",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "url",column = "url",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "followers",column = "followers",jdbcType = JdbcType.INTEGER,javaType = Long.class),
            @Result(property = "articlesCount",column = "articles_count",jdbcType = JdbcType.INTEGER,javaType = Long.class)
    })
    List<ColumnItem> getTop4Columns();
}
