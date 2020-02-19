package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("Select id,mobile,email,password,name,url_token,avatar_url,url,headline," +
            "description,user_cover,created")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = String.class),
            @Result(property = "mobile",column = "mobile",javaType = Long.class),
            @Result(property = "email",column = "email",javaType = Long.class),
            @Result(property = "password",column = "password",javaType = Long.class),
            @Result(property = "name",column = "name",javaType = Long.class),
            @Result(property = "urlToken",column = "url_token",javaType = Long.class),
            @Result(property = "avatarUrl",column = "avatar_url",javaType = Long.class),
            @Result(property = "url",column = "url",javaType = Long.class),
            @Result(property = "headline",column = "headline",javaType = Long.class),
            @Result(property = "description",column = "description",javaType = Long.class),
            @Result(property = "userCover",column = "user_cover",javaType = Long.class),
            @Result(property = "created",column = "created",javaType = Long.class)
    })
    List<User> getUser();

    @Select("Select id,mobile,email,password,name,url_token,avatar_url,url,headline," +
            "description,user_cover,created order by created DESC limit 0,4")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = String.class),
            @Result(property = "mobile",column = "mobile",javaType = Long.class),
            @Result(property = "email",column = "email",javaType = Long.class),
            @Result(property = "password",column = "password",javaType = Long.class),
            @Result(property = "name",column = "name",javaType = Long.class),
            @Result(property = "urlToken",column = "url_token",javaType = Long.class),
            @Result(property = "avatarUrl",column = "avatar_url",javaType = Long.class),
            @Result(property = "url",column = "url",javaType = Long.class),
            @Result(property = "headline",column = "headline",javaType = Long.class),
            @Result(property = "description",column = "description",javaType = Long.class),
            @Result(property = "userCover",column = "user_cover",javaType = Long.class),
            @Result(property = "created",column = "created",javaType = Long.class)
    })
    List<User> getFourUser();
}
