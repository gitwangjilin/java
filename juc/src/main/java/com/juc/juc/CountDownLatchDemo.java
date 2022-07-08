package com.juc.juc;

import java.util.concurrent.CountDownLatch;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: CountDownLatch
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/22   WangJiLin     Create the current class
 *************************************************************************
 ******/
//演示 CountDownLatch
public class CountDownLatchDemo {
    //6个同学陆续离开教室之后，班长锁门
    public static void main(String[] args) throws InterruptedException {

        //创建CountDownLatch对象，设置初始值
        CountDownLatch countDownLatch = new CountDownLatch(6);

        //6个同学陆续离开教室之后
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 号同学离开了教室");

                //计数  -1
                countDownLatch.countDown();

            }, String.valueOf(i)).start();
        }

        //等待
        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() + " 班长锁门走人了");
    }
}
