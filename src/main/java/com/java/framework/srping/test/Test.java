package com.java.framework.srping.test;

import com.java.framework.srping.app.AppConfig;
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
 * 2021/8/25   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
