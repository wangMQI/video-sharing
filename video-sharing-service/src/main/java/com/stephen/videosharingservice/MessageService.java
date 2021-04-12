package com.stephen.videosharingservice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stephen.videosharing.entity.Message;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 20:49
 * @Version:
 * @Description:
 */
public interface MessageService extends IService<Message> {

    boolean sendNotify(String userId);
}