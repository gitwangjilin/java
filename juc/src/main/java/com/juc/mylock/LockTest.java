package com.juc.mylock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: LockTest
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
public class LockTest  {
    Lock lock = new ReentrantLock();

    public void lock(String name) {
        // 获取锁
        lock.lock();
        try {
            System.out.println(name + " get the lock");
            // 访问此锁保护的资源
        } finally {
            // 释放锁
            lock.unlock();
            System.out.println(name + " release the lock");
        }
    }

    public static void main(String[] args) {
        LockTest lt = new LockTest();
        new Thread(() -> lt.lock("A")).start();
        new Thread(() -> lt.lock("B")).start();
    }
}
