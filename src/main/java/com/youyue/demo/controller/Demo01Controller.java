package com.youyue.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName： Demo01Controller
 * @Description: java类作用描述
 * @Author: 梅哲豪
 * @Date: 2021/9/28 14:46
 * @Version: 1.0
 *
 */
/*@Controller    //跳转视图，返回的是jsp页面
@RestController  //返回JSON数据
@RequestMapping("/") // 设置请求路径,/代表根路径
@ResponseBody  代表如果返回的是普通字符串，那么直接返回字符串，如果返回的是JSON，自动转换为JSON格式返回
*/
@RestController
@RequestMapping("/demo")
public class Demo01Controller {
    @RequestMapping("/") // 设置请求路径
    @ResponseBody
    public String login() {
        return "zhe shi deng lu！！";
    }
    @RequestMapping("/memu") // 设置请求路径
    @ResponseBody
    public String menu() {
        return "zhe shi cai dan！！";
    }
}
