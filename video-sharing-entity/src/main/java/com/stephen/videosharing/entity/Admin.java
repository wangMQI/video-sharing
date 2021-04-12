package com.stephen.videosharing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:10
 * @Version:
 * @Description:
 */
@TableName("admin")
@Data
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员id
     */
    private Integer adminId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 操作权限
     */
    private Integer operate;

    /**
     * 管理员头像
     */
    private String adminAvatarUrl;



    @Override
    public String toString() {
        return "AdminEntity{" +
                "adminId=" + adminId +
                ", name=" + name +
                ", password=" + password +
                ", email=" + email +
                ", phone=" + phone +
                ", status=" + status +
                ", operate=" + operate +
                ", adminAvatarUrl=" + adminAvatarUrl +
                "}";
    }
}

