package com.msb.kupai.code01;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code01_BubbleSort
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
public class Code02_BubbleSort {
    public static void main(String[] args) {
        int[] arrs = {2, 8, 96, 89, 196, 3, 1};
//        //选择排序
//        selectSort(arrs);
//        //冒泡排序
        bubblingSort(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    private static void bubblingSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                int temp = 0;
                if (arrs[j] > arrs[j + 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }

            }

        }
    }
}
