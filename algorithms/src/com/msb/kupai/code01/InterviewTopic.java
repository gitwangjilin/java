package com.msb.kupai.code01;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: InterviewTopic
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/18   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class InterviewTopic {
    public static void main(String[] args) {
//        1.不加变量两数交换
//        doubleSwap(17, 3);
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(4));
//        2.获取整数中最右侧的1
//        3.数组中有多组重复是偶数和两个不相等的奇数，获取奇数
//        int[] arrs = {2, 3, 4, 5, 4, 3, 2, 7};
        int[] arrs = {3,3, 2, 4};
        printOddTimesNum(arrs);
    }

    private static void printOddTimesNum(int[] arrs) {
        int eor = 0;
        for (int i = 0; i < arrs.length; i++) {
            eor ^= arrs[i];
        }
        System.out.println(eor);
        int rightOne = eor & (~eor + 1);
        System.out.println(rightOne);
        int onlyOne = 0;
        System.out.println(2&2);
        System.out.println(4&2);
        for (int i = 0; i < arrs.length; i++) {
            if ((arrs[i] & rightOne) == 0) {
                System.out.println("==="+arrs[i]);
                onlyOne ^= arrs[i];
            }

        }
        System.out.println(eor);
        System.out.println(onlyOne + "======" + (eor ^ onlyOne));
    }

    private static void doubleSwap(int i, int j) {

        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println(i + "==" + j + "===" + i);
        System.out.println(i & (-i + 1));
    }
}
