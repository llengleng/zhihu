package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.entity.User;
import com.scs.soft.zhihu.api.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("api/zhihu/user")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("api/zhihu/user-four")
    public ResponseEntity getFourUsers() {
        return ResponseEntity.ok(userService.getFourUsers());
    }
}
