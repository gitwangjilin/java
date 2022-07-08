package com.juc.thvolatile;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyLockTset
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/17   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class MyLockTset {
    public static void main(String[] args) {
        LockDemoClass demoClass = new LockDemoClass();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                demoClass.increment();
            }
        }, "线程A").start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                demoClass.decrement();
            }
        }, "线程B").start();
    }
}


class LockDemoClass {
    //加减对象
    private int numbers = 0;
    //声明锁
    private Lock lock = new ReentrantLock();
    //声明钥匙
    private Condition condition = lock.newCondition();

    /**
     * 加1
     */
    public void increment() {
        lock.lock();
        try {
            while (numbers != 0) {
                condition.await();
            }
            numbers++;
            System.out.println("----线程：" + Thread.currentThread().getName() + "加一成值：" + numbers);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 减1
     */
    public void decrement() {
        lock.lock();
        try {
            while (numbers == 0) {
                condition.await();
            }
            numbers--;
            System.out.println("----线程：" + Thread.currentThread().getName() + "加一成值：" + numbers);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}