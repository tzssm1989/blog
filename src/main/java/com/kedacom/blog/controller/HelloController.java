package com.kedacom.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songsm
 * @data 2019/2/13 下午9:08
 * @desc 用一句话描述此类的作用
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
