package com.youyue.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName： Demo02Controller
 * @Description: java类作用描述
 * @Author: 梅哲豪
 * @Date: 2021/9/28 20:44
 * @Version: 1.0
 */
@RestController

@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/demo02")
public class Demo02Controller {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestBody Map map) {
        System.out.println(map);
        return "demo02";
    }
}
