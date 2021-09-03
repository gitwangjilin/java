package com.java.framework.aop.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyAspect
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/9/1   WangJiLin     Create the current class
 *************************************************************************
 ******/
@Component
@Aspect
public class AspectMy {

    @Pointcut("execution(* com.java.framework.aop.service..*.*(..))")
    public void pointCut( ){
        System.out.println("proxy before");

    }
    @Before("pointCut()")
    public void before(){
        System.out.println("proxy before");
    }
}
