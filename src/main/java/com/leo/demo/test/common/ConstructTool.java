package com.leo.demo.test.common;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 文件名：ConstructTool.java
 *
 * @create 2018-05-05 11:13
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
@Component
public class ConstructTool {

    @PostConstruct
    public void initial2(){
        System.out.println("--------->PostConstruct2222222222222.....");
    }


    @PostConstruct
    public void initial(){
        System.out.println("--------->PostConstruct.....");
    }


}
