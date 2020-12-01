package com.example.pojo;


import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
//对象由框架来创建
public class Response {
    public Integer code;
    public String msg;
    public Object data = null;

    public Response(){

    }

    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
