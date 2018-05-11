package com.leo.demo.test.service.impl;

import com.leo.demo.test.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * 文件名：TestServiceImpl.java
 *
 * @create 2018-04-19 18:11
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Service
public class TestServiceImpl implements ITestService {
    @Override
    public void get() {
        System.out.println("testService get method invoke! ");
    }

    @Override
    public void initlaLoadData() {
        System.out.println("=========>initlaLoadData......");
    }
}
