package com.stephen.videosharing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:20
 * @Version:
 * @Description:
 */
@TableName("user")
@Data
public class User implements Serializable {



    private static final long serialVersionUID = 1L;

    /**
     * 用户Id
     */
    private Integer uid;

    /**
     * 用户昵称
     */
    private String nikeName;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 上传视频id
     */
    private String videoId;

    /**
     * 评论id
     */
    private String commentId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 用户头像地址
     */
    private String userAvatarUrl;

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", nikeName=" + nikeName +
                ", phone=" + phone +
                ", email=" + email +
                ", videoId=" + videoId +
                ", commentId=" + commentId +
                ", status=" + status +
                ", userAvatarUrl=" + userAvatarUrl +
                "}";
    }
}
