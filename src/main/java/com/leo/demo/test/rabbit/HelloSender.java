package com.leo.demo.test.rabbit;

import com.leo.demo.test.common.User;
import com.leo.demo.test.rabbit.route.TopicRouteRabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 文件名：HelloSender.java
 *
 * @create 2018-05-05 11:34
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(int i){
        String text = "hello"+new Date()+"\t"+i;
        System.out.println("Send :"+text);
        rabbitTemplate.convertAndSend("hello",text);
        return text;
    }

    public void sendUser(){
        User u = new User();
        u.setAge(1);
        u.setName("盘");
        System.out.println("Send user:"+u);
        rabbitTemplate.convertAndSend("hello",u);
    }


    public String send1(){
        String text = "hi i am message 1 send message";
        System.out.println("sender : "+text);
        this.rabbitTemplate.convertAndSend("exchange", TopicRouteRabbitConfig.message,text);
        return "success send1";
    }
    public String send2(){
        String text = "hi i am message 2 send messages";
        System.out.println("sender : "+text);
        this.rabbitTemplate.convertAndSend("exchange", TopicRouteRabbitConfig.messages,text);
        return "success send2";
    }
}
