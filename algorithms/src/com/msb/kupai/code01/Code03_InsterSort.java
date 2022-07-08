package com.msb.kupai.code01;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code01_SelectionSort
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/16   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Code03_InsterSort {
    public static void main(String[] args) {
        int[] arrs = {2, 8, 96, 89, 196, 3, 1};
//        //插入排序
        insertionSort(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    /**
     * 插入排序
     *
     * @param arrs
     */
    private static void insertionSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            int temp = 0;
            for (int j = i; j > 0; j--) {
                if (arrs[j] < arrs[j - 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j - 1];
                    arrs[j - 1] = temp;
                }

            }

        }
    }


}
