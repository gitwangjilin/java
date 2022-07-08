package com.juc.readwrite;

import com.shangzhao.sm3sdk.sm3.Sms3Hash;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Dome
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/23   WangJiLin     Create the current class
 *************************************************************************
 ******/
//演示读写锁降级
public class Demo {

    public static void main(String[] args) throws Exception {
        //可重入读写锁对象
//        ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
//        ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();//读锁
//        ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();//写锁
        System.out.println(Sms3Hash.getIdCard("410823199405220171"));
//        //锁降级
//        //2 获取读锁
//        readLock.lock();
//        System.out.println("---read");
//
//        //1 获取写锁
//        writeLock.lock();
//        System.out.println("atguigu");
//
//        //3 释放写锁
//        writeLock.unlock();
//
//        //4 释放读锁
//        readLock.unlock();
    }
}
