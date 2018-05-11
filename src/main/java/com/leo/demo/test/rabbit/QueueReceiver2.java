package com.leo.demo.test.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 文件名：HelloReceiver.java
 *
 * @create 2018-05-05 11:37
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Component
@RabbitListener(queues="hello")
public class QueueReceiver2 {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receive2 :"+hello);
    }
}
