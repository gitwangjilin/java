package com.java.framework.aop.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Config
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
@Configuration
@ComponentScan("com.java.framework.aop")
//@Lazy
@EnableAspectJAutoProxy
public class AppConfig {
}
