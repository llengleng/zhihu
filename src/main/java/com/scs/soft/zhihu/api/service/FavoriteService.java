package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;

public interface FavoriteService {
    List<Favorite> getFavorites();
    List<Favorite> getFourFavorites();

}
