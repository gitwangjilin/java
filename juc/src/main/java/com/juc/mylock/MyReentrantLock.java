package com.juc.mylock;

import java.util.concurrent.locks.ReentrantLock;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyReentrantLock
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
public class MyReentrantLock {
    public static void main(String[] args) {
        MyReentrantLock lt = new MyReentrantLock();
        new Thread(() -> lt.lock("A")).start();
        new Thread(() -> lt.lock("b")).start();
    }

    public void lock(String string) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {
            System.out.println("获取到锁"+ string);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
