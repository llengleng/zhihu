package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Favorite {
    private Long id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Long followers;
    private Long totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Long voteupCount;
    private Long commentCount;
}
