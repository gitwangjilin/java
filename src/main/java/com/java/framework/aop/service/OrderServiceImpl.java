package com.java.framework.aop.service;

import com.java.framework.aop.dao.OrderTabDao;
import com.java.framework.aop.dao.OrderTabDaoBImpl;
import com.java.framework.aop.dao.OrderTabDaoIAmpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: OrderServiceImpl
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/9/2   WangJiLin     Create the current class
 *************************************************************************
 ******/
@Component
public class OrderServiceImpl implements ApplicationContextAware {
    ApplicationContext applicationContext;
    @Resource
    Map<String, OrderTabDao> map;
    public void qurey(String name) {
        if (name.equals("a")) {
            OrderTabDaoIAmpl bean = applicationContext.getBean(OrderTabDaoIAmpl.class);
            bean.qurey();
        } else {
            OrderTabDaoBImpl bean = applicationContext.getBean(OrderTabDaoBImpl.class);
            bean.qurey();
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
