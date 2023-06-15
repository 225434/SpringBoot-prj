package com.yCloud.controller;

import com.yCloud.vo.School;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {

    @Resource
    private School school;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot() {
        return "School对象：" + school.toString();
    }
}
