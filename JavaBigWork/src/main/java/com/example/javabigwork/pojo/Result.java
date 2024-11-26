package com.example.javabigwork.pojo;

import lombok.Data;

@Data
public class Result<E> {
    private Integer code;
    private String message;
    private E data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, E data) {
        this.code = code;
        this.data = data;
    }

    static Result error(String message) {
        return new Result(0, message);
    }

    public static Result success() {
        return new Result(1, "操作成功");
    }

    public static <E> Result<E> success(E data) {
        return new Result<E>(1, data);
    }
}
