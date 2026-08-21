package com.example.common;

import java.io.Serializable;

/**
 * Unified API response wrapper (showcase snippet).
 */
public class Result<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.code = "200";
        r.msg = "success";
        r.data = data;
        return r;
    }

    public static <T> Result<T> error(String code, String msg) {
        Result<T> r = new Result<>();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public String getCode() { return code; }
    public String getMsg() { return msg; }
    public T getData() { return data; }
}