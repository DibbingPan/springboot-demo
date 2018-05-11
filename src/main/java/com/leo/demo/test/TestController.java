package com.leo.demo.test;

import com.leo.demo.test.rabbit.HelloSender;
import com.leo.demo.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名：TestController.java
 *
 * @create 2018-04-19 17:48
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@RestController
public class TestController {


    @Autowired
    ITestService testService;
    @RequestMapping("/")
    public String home(){
        testService.get();
        return "hello world!";
    }

    @Autowired
    HelloSender helloSender;


    @RequestMapping("/send")
    @ResponseBody
    public String send(){
        return helloSender.send(0);
    }


    @RequestMapping("/sendMany")
    @ResponseBody
    public String sendMany(){
        for (int i = 0; i < 100; i++) {
            helloSender.send(i);
        }
        return 111+"";
    }
    @RequestMapping("/sendUser")
    @ResponseBody
    public String sendUser(){
        helloSender.sendUser();
        return "sendUser";
    }

    @RequestMapping("/send1")
    @ResponseBody
    public String send1(){
        return helloSender.send1();
    }
    @RequestMapping("/send2")
    @ResponseBody
    public String send2(){
        return helloSender.send2();
    }
}
