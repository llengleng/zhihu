package com.scs.soft.zhihu.api.service.ipml;

import com.scs.soft.zhihu.api.entity.User;
import com.scs.soft.zhihu.api.mapper.UserMapper;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUser();
    }

    @Override
    public List<User> getFourUsers() {
        return userMapper.getFourUser();
    }
}
