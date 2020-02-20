package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface RoundTableMapper {
    /**
     * 查询所有圆桌讨论
     * @return
     */
    @Select(" SELECT id,name,banner,url_token,visits_count,include_count FROM t_round_table ")
    List<RoundTable> getAllRoundTable();

    /**
     * 查询前4个圆桌讨论
     */
    @Select("SELECT id,name,banner,url_token,visits_count,include_count FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4")
    @Results({
            @Result(id = true,property = "id",column = "roundId",javaType = Integer.class),
            @Result(property = "name",column = "name",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "banner",column = "banner",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            //@Result(property = "urlToken",column = "tiny_banner",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "urlToken",column = "url_token",jdbcType = JdbcType.VARCHAR,javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",jdbcType = JdbcType.INTEGER,javaType = Long.class),
            @Result(property = "includeCount",column = "include_count",jdbcType = JdbcType.INTEGER,javaType = Long.class)
    })
    List<RoundTable> getRoundTable();
}

