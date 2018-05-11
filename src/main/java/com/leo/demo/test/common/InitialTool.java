package com.leo.demo.test.common;

import com.leo.demo.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 文件名：InitialTool.java
 *
 * @create 2018-05-05 11:04
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Component
@Order(1) // 初始化执行顺序
public class InitialTool implements CommandLineRunner {
    @Autowired
    ITestService testService;
    @Override
    public void run(String... args) {
        System.out.println("初始化1.....................");
        testService.initlaLoadData();
    }
}
