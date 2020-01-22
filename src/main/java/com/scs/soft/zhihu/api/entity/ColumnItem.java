package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ColumnItem implements Serializable {
    /**
     * 主键：编码
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 介绍
     */
    private String description;
    /**
     * 链接
     */
    private String url;
    /**
     * 图片链接
     */
    private String imageUrl;
    /**
     * 关注人数
     */
    private Long followers;
    /**
     * 文章数
     */
    private Long articlesCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public Long getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(Long articlesCount) {
        this.articlesCount = articlesCount;
    }
}
