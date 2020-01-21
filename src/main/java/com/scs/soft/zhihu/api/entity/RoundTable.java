package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@Data
@Builder
public class RoundTable {
    private Integer roundId;
    private String name;
    private String banner;
    private String urlToken;
    private Long visitsCount;
    private Long includeCount;
}
