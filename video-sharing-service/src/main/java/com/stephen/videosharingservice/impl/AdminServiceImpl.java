package com.stephen.videosharingservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.videosharing.entity.Admin;
import com.stephen.videosharing.mapper.AdminMapper;
import com.stephen.videosharingservice.AdminService;
import org.springframework.stereotype.Service;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:13
 * @Version:
 * @Description:
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public boolean login(String userId, String password) {
        return false;
    }



    public boolean getAdmin(String adminId, String password){

        return false;

    }
}