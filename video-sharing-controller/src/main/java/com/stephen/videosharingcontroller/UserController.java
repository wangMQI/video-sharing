package com.stephen.videosharingcontroller;

import com.stephen.videoSharing.util.code.Code;
import com.stephen.videoSharing.util.result.Result;
import com.stephen.videosharing.entity.Comment;
import com.stephen.videosharing.entity.User;
import com.stephen.videosharing.entity.Video;
import com.stephen.videosharingservice.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:28
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping("/user-entity")
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
//@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class UserController {


    private UserService userService;

    @Autowired
    @SuppressWarnings("all")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public Result login(String userId, String password) {
        return userService.login(userId, password) ? new Result(Code.Login_Success) : new Result(Code.Password_Wrong);
    }


    public Result regist(User user) {
        return userService.regist(user) ? new Result(Code.Login_Success) : new Result(Code.Password_Wrong);
    }

    public Result deleteUser(String userId) {
        return userService.deleteUser(userId) ? new Result(Code.Delete_Success) : new Result(Code.Delete_Fail);
    }

    public Result logOut(User userId) {
        return userService.logOut(userId)?new Result(Code.Logout_Success):new Result(Code.Logout_Fail);
    }


/*    public Video loadVideo(Video video) {
    }

    public boolean comment(String userid,String comment) {
    }*/
}
