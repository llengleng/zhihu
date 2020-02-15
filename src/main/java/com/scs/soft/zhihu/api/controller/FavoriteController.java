package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FavoriteController {
    @Resource
    private FavoriteMapper favoriteMapper;

    @GetMapping("/api/zhihu/t-favorites")
    public ResponseEntity getFavorites(){
        return ResponseEntity.ok(favoriteMapper.geAllFavorites());

    }

    @GetMapping("/api/zhihu/t-favorites-four")
    public ResponseEntity getFourFavorites(){
        return ResponseEntity.ok(favoriteMapper.getFourFavorites());
    }
}
