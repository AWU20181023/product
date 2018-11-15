package com.gree.product.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class Result {
    @JSONField(ordinal = 1)
    private Integer code;
    @JSONField(ordinal = 21)
    private String msg;
    @JSONField(ordinal = 3)
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
