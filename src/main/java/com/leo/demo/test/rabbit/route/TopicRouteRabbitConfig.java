package com.leo.demo.test.rabbit.route;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件名：TopicRouteRabbitConfig.java
 *
 * @create 2018-05-05 13:02
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Configuration
public class TopicRouteRabbitConfig {
    public final static String message = "topic.message";
    public final static String messages = "topic.messages";

    @Bean
    public Queue queueMessage(){
        return new Queue(message);
    }

    @Bean
    public Queue queueMessages(){
        return new Queue(messages);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with(message);
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with(messages);
    }

}
