package com.stephen.videosharingservice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stephen.videosharing.entity.User;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:29
 * @Version:
 * @Description:
 */
public interface UserService extends IService<User> {

    boolean login(String userId,String password);

    boolean regist(User user);

    boolean deleteUser(String userId);

    boolean logOut(User userId);
}

