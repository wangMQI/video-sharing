package com.stephen.videosharing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 20:42
 * @Version:
 * @Description:
 */
@TableName("message")
@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 消息接收人
     */
    private String userId;

    private String message;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 消息发送者
     */
    private String ctrator;


}
