package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@Data
@Builder
public class RoundTable implements Serializable  {
    private Integer roundId;
    private String name;
    private String banner;
    private String urlToken;
    private Long visitsCount;
    private Long includeCount;

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken(String urlToken) {
        this.urlToken = urlToken;
    }

    public Long getVisitsCount() {
        return visitsCount;
    }

    public void setVisitsCount(Long visitsCount) {
        this.visitsCount = visitsCount;
    }

    public Long getIncludeCount() {
        return includeCount;
    }

    public void setIncludeCount(Long includeCount) {
        this.includeCount = includeCount;
    }
}
