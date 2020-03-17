package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMappingでHTTP通信のパスとメソッドをマッピングして処理をさばく
@RequestMapping("api")
public class Controller {

    @RequestMapping("hello")
    private String hello(){
        return "Hello world.";
    }
}
