package com.leo.demo.test.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 文件名：InitialTool2.java
 *
 * @create 2018-05-05 11:10
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Component
@Order(3)
public class InitialTool2 implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("----------------->初始化2");
    }
}
