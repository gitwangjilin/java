package com.sgg.duilie_02;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: ArrayQueueDemo
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/26   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class ArrayQueueTest {
    public int headNode;
    public int endNode;
    public int sizeMax;
    public int[] arrs;

    public ArrayQueueTest(int no) {
        this.sizeMax = no;
        this.arrs = new int[no];
    }


    private void addQueue(int no) {
        if ((endNode + 1) % sizeMax == headNode) {
            System.out.println("数组已满");
            return;
        }
        arrs[endNode] = no;
        endNode = (endNode + 1) % sizeMax;
    }


    public static void main(String[] args) {
        ArrayQueueTest arrayQueueDemo = new ArrayQueueTest(4);
        arrayQueueDemo.addQueue(0);
        arrayQueueDemo.addQueue(1);
        arrayQueueDemo.addQueue(2);
        arrayQueueDemo.addQueue(2);
        arrayQueueDemo.getQueue();
        arrayQueueDemo.getQueue();
        arrayQueueDemo.getQueue();
        arrayQueueDemo.addQueue(2);
        arrayQueueDemo.getQueue();
        arrayQueueDemo.showQueue();
    }

    public int getQueue() {
        if (headNode== endNode) {
            System.out.println("数组为空");
            return -1;
        }
        headNode = (headNode + 1) % sizeMax;
        return 1;
    }

    private void showQueue() {
        System.out.println(Arrays.toString(arrs));

    }

}
