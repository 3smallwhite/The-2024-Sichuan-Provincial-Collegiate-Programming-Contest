package com.example.javabigwork.controller;

import com.example.javabigwork.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/product")
public class ProductController {
    @GetMapping("/find")
    public Result getProduct(String findParam) {
        return Result.success();
    }
}
