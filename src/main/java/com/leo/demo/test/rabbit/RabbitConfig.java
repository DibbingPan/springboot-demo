package com.leo.demo.test.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 * 文件名：RabbitConfig.java
 *
 * @create 2018-05-05 11:33
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Configuration
public class RabbitConfig {
    public Queue Queue(){
        return new Queue("hello");
    }
}
