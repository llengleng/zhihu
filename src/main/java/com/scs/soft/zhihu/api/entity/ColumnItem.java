package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ColumnItem {
    /**
     * 主键：编码
     */
    Long id;
    /**
     * 标题
     */
    String title;
    /**
     * 介绍
     */
    String description;
    /**
     * 链接
     */
    String url;
    /**
     * 图片链接
     */
    String imageUrl;
    /**
     * 关注人数
     */
    Long followers;
    /**
     * 文章数
     */
    Long articlesCount;
}
