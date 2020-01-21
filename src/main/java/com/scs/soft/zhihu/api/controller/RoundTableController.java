package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return Result.success(roundTableService.getAllRoundTable());
    }

    @GetMapping
    public Result getRoundTable(){
        return Result.success(roundTableService.getRoundTable());
    }
}