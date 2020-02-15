package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String id;
    Long mobile;
    Long email;
    String password;
    String name;
    String urlToken;
    String avatarUrl;
    String url;
    String headline;
    String description;
    String userCover;
    String created;
}
