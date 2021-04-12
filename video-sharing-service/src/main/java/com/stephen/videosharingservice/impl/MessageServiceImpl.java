package com.stephen.videosharingservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.videosharing.entity.Message;
import com.stephen.videosharing.mapper.MessageMapper;
import com.stephen.videosharingservice.MessageService;
import org.springframework.stereotype.Service;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 20:50
 * @Version:
 * @Description:
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

    @Override
    public boolean sendNotify(String userId){
        return true;
    }
}
