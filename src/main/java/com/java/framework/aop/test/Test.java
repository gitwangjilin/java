package com.java.framework.aop.test;

import com.java.framework.aop.app.AppConfig;
import com.java.framework.aop.service.OrderServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Test
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/8/25   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderServiceImpl bean = applicationContext.getBean(OrderServiceImpl.class);
        bean.qurey("a");
        bean.qurey("b");
    }
}
