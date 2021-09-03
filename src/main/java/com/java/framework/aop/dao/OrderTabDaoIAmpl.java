package com.java.framework.aop.dao;

import org.springframework.stereotype.Component;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: OrderTabDaoImpl
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
public class OrderTabDaoIAmpl implements OrderTabDao{
    @Override
    public void qurey() {
        System.out.println("OrderTabDaoIAmpl =====");
    }
}
