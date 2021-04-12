package com.stephen.videosharingcontroller;

import com.stephen.videosharingservice.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:20
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping("/admin-entity")
public class AdminController {

    @Autowired
    private AdminService adminService;

}

