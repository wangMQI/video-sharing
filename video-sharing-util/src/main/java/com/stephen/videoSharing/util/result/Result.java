package com.stephen.videoSharing.util.result;

import com.stephen.videoSharing.util.code.Code;
import lombok.Data;

/**
 * @program: video-sharing
 * @author: Stephen·Wang
 * @date: 2021/4/12 14:06
 * @Version:
 * @Description:
 */

@Data
public class Result<T> {

    /**
     * @Fields code : 返回状态码
     */
    private String code;

    /**
     * @Fields msg : 返回消息描述
     */
    private String msg;

    /**
     * @Fields data : 返回实体数据
     */
    private T data;

    /**
     * <p>Title: </p>
     * <p>Description: 异常返回时的返回构造描述</p>
     *
     * @param code
     * @param msg
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Code code,T data) {
        this.data = data;
        this.code = code.getNum();
        this.msg = code.getMsg();
    }

    public Result(Code code){
        this.code = code.getNum();
        this.msg = code.getMsg();
    }

}
