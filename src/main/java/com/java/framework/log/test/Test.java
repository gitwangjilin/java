package com.java.framework.log.test;

import com.java.framework.log.app.Appconfig;
import com.java.framework.log.service.UserService;
import org.apache.ibatis.session.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
 * 2021/8/26   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        UserService userService =  applicationContext.getBean(UserService.class);
        System.out.println(userService.list());

    }
}
