package com.juc.thread;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyThread
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/14   WangJiLin     Create the current class
 *************************************************************************
 ******/

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread2.setName("2");
        myThread1.setName("1");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

}

class MyThread extends Thread {
    public int i = 0;

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().isDaemon());
        for (int j = 0; j < 5; j++) {
            System.out.println(DateUtil.getDate("20210829142532"));
        }
    }
}