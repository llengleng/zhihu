package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/columns")
public class ColumnController {
    @Resource
    private ColumnService columnService;

    @GetMapping("/all")
    public Result getAllColumns(){
        return Result.success(columnService.getAllColumns());
    }

    @GetMapping("/top")
    public Result getTop4Columns(){
        return Result.success(columnService.getTop4Columns());
    }
}
