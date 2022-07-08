package com.juc.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: ThreadPoolDemo1
 * - @Author: WangJiLIn
 * - Description:  演示线程池三种常用分类
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/28   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //一池五线程
        ExecutorService threadPool1 = Executors.newFixedThreadPool(4); //5个窗口

        //一池一线程
        ExecutorService threadPool2 = Executors.newSingleThreadExecutor(); //一个窗口

        //一池可扩容线程
        ExecutorService threadPool3 = Executors.newCachedThreadPool();
        //10个顾客请求
        try {
            for (int i = 1; i <=30; i++) {
                //执行
                threadPool1.execute(()->{
                    System.out.println(Thread.currentThread().getName()+" 办理业务");
                });
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭
            threadPool3.shutdown();
        }

    }

}

