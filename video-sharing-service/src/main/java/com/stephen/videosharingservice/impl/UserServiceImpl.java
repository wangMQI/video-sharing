package com.stephen.videosharingservice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stephen.videosharing.entity.Comment;
import com.stephen.videosharing.entity.Message;
import com.stephen.videosharing.entity.User;
import com.stephen.videosharing.entity.Video;
import com.stephen.videosharing.mapper.UserMapper;
import com.stephen.videosharingservice.CommentService;
import com.stephen.videosharingservice.MessageService;
import com.stephen.videosharingservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 17:22
 * @Version:
 * @Description:
 */
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    private CommentService commentService;

    @Autowired
    public void setCommentService(CommentService commentService){
        this.commentService = commentService;
    }

    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }


    @Override
    public boolean login(String phone, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq(phone,password);
        return this.getOne(wrapper)!=null?true:false;
    }

    @Override
    public boolean regist(User user) {
        return this.save(user)?true:false;
    }

    @Override
    public boolean deleteUser(String userId) {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq(userId,userId);
        return this.remove(wrapper)?true:false;
    }

    @Override
    public boolean logOut(User userId) {
        return false;
    }



    public List<Comment> getComment(String videoId){

        //得到用户视频父评论id
/*        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq(userId,userId);
        wrapper.eq(videoId,videoId);
        String commentIds = this.getOne(wrapper).getCommentId();
        String[] commentIdArray = commentIds.split(",");*/

        QueryWrapper<Comment> wrappers = new QueryWrapper<>();

        wrappers.eq(videoId,videoId);

        //
        //List<Comment> commentList = commentService.list(wrappers);

        //Comment[]comments = commentList.toArray(new Comment[0]);
//
        //for (int i = 0; i < comments.length; i++) {
        //    String[] comms = comments[i].getReplyId().split(",");
        //}

       // commentList.forEach(t->getComment(t.getReplyId().split(",")));


        return commentService.list(wrappers);


    }

    public boolean addComment(String userId){
        return true;
    }

    public void sendMessage(Message message){

        messageService.save(message);

        messageService.sendNotify(message.getUserId());

    }

    public boolean upload(Video video){
        return true;
    }

}
