package com.juc.mylock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: MyReadWriteLock
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
public class MyReadWriteLock {
    private ReentrantReadWriteLock rrwlock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final MyReadWriteLock myReadWriteLock = new MyReadWriteLock();
        new Thread() {
            @Override
            public void run() {
                myReadWriteLock.getRead(Thread.currentThread());
                myReadWriteLock.getWrite(Thread.currentThread());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                myReadWriteLock.getRead(Thread.currentThread());
                myReadWriteLock.getWrite(Thread.currentThread());
            }
        }.start();
    }

    public synchronized void getRead(Thread thread) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1) {
            System.out.println(thread.getName() + "正在进行读操作");
        }
        System.out.println(thread.getName() + "读操作完成");
    }

    public void getWrite(Thread thread) {
        rrwlock.readLock().lock();
        try {
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完成");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rrwlock.readLock().lock();
        }
    }
}
