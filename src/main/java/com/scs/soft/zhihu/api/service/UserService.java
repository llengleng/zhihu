package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    List<User> getFourUsers();
}
