package com.stephen.videosharingservice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stephen.videosharing.entity.Admin;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:12
 * @Version:
 * @Description:
 */
public interface AdminService extends IService<Admin> {
    boolean login(String userId,String password);

}
