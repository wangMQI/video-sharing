package com.stephen.videosharingservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.videosharing.entity.Comment;
import com.stephen.videosharing.entity.User;
import com.stephen.videosharing.mapper.CommentMapper;
import com.stephen.videosharing.mapper.UserMapper;
import com.stephen.videosharingservice.CommentService;
import com.stephen.videosharingservice.UserService;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 20:34
 * @Version:
 * @Description:
 */
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    public boolean addComment(Comment comment){
        return this.save(comment);

    }



}
