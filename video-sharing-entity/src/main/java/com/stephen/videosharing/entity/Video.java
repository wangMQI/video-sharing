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
@TableName("video")
@Data
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频id
     */
    private Integer videoId;

    /**
     * 视频描述
     */
    private String describation;

    /**
     * 作者
     */
    private String author;

    /**
     * 作者id
     */
    private Integer authorId;

    /**
     * 上传时间，long类型
     */
    private String time;

    /**
     * 评论，形如123456,123789,123258...（以英文逗号隔开）
     */
    private String commentId;

    /**
     * 点赞数
     */
    private Integer like;

    /**
     * 收藏数
     */
    private Integer favorites;

    /**
     * 视频地址
     */
    private String videoUrl;

    /**
     * 视频海报地址
     */
    private String videoImageUrl;

}
