package com.stephen.videosharing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 13:21
 * @Version:
 * @Description:
 */
@TableName("comment")
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer commentId;

    /**
     * 评论
     */
    private String comment;

    /**
     * 回复id
     */
    private String replyId;

    /**
     * 所属视频id
     */
    private String videoId;



}
