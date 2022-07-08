package com.juc.thread;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyRunnable
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
public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}


class MyRunnable implements Runnable {
    public int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(i += j);
        }
    }
}
