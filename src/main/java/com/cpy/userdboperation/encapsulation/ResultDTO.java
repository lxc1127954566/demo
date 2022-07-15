package com.cpy.userdboperation.encapsulation;


import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/*
*
*  封装数据返回
*
* */
@Setter
@Getter
public class ResultDTO{


    private Integer code;                 //返回状态
    private String msg;                     //返回消息
    private Map<String, Object> body;       //返回数据
    private static final Integer successCode = 200;
    private static final String successMsg = "实现成功";
    private Long totalMeg;
    private Long totalPage;

    public ResultDTO() {
    }

    public ResultDTO(Integer code, String msg, Map<String, Object> body, Long totalMeg, Long totalPage) {
        this.code = code;
        this.msg = msg;
        this.body = body;
        this.totalMeg = totalMeg;
        this.totalPage = totalPage;
    }

    public ResultDTO(Integer code, String msg, Map<String, Object> body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
    }

    public ResultDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return code == 200;
    }

    public static ResultDTO successTotal(Long totalMeg,Long totalPage) {
        return new ResultDTO(successCode, successMsg, new LinkedHashMap<>(),totalMeg,totalPage);
    }

    public static ResultDTO success() {
        return new ResultDTO(successCode, successMsg);
    }


    public static ResultDTO errorWithCodeAndMsg(Integer code, String msg) {
        return new ResultDTO(code, msg, new LinkedHashMap<>());
    }

    public ResultDTO add(String key, Object value) {
        body.put(key, value);
        return this;
    }

    public ResultDTO allAll(Map<String, Object> map) {
        body.putAll(map);
        return this;
    }

    @Override
    public String toString() {
        return String.format(
                "%s(code=%d,msg=%s,body[%s].size=%d)",
                this.getClass().getName(),code,msg,body.getClass().getName()
        );
    }
}