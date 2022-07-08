package com.juc.thvolatile;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: VolatileTest
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class VolatileTest {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("线程A");
                demoClass.increment();
            }
        },"线程A").start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("线程B");
                demoClass.decrement();
            }
        },"线程B").start();
    }
}

class DemoClass {
    private int numbers = 0;

    public synchronized void increment() {
        try {
            while (numbers != 0) {
                this.wait();
            }
            numbers++;
            System.out.println("------" + Thread.currentThread().getName() + "加一成值为：" + numbers);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public synchronized void decrement() {
        try {
            while (numbers == 0) {
                this.wait();
            }
            numbers--;
            System.out.println("------" + Thread.currentThread().getName() + "减一成值为：" + numbers);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}