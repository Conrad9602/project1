package com.xzhu.cardproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/test")
   public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        System.out.print("test123");
        return model;
    }
//    @ResponseBody //表示返回json字符串给前端
//    String index() {
//        return "hello";
//    }

}
