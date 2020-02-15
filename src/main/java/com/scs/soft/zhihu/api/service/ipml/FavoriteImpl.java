package com.scs.soft.zhihu.api.service.ipml;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FavoriteImpl implements FavoriteService{

    @Resource
    private FavoriteService favoriteService;

    @Override
    public List<Favorite> getFavorites() {
        return favoriteService.getFavorites();
    }

    @Override
    public List<Favorite> getFourFavorites() {
        return favoriteService.getFourFavorites();
    }
}
