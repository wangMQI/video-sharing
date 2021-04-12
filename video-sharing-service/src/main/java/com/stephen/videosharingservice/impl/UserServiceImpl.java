package com.stephen.videosharingservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.videosharing.entity.User;
import com.stephen.videosharing.mapper.UserMapper;
import com.stephen.videosharingservice.UserService;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 17:22
 * @Version:
 * @Description:
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean login(String userId, String password) {
        return false;
    }

    @Override
    public boolean regist(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(String userId) {
        return false;
    }
}
