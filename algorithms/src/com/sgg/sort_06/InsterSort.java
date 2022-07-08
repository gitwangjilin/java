package com.sgg.sort_06;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: InsterSort
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/28   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class InsterSort {
    public static void main(String[] args) {
        int[] arrs = {2, 412, 2, 123, 2, 4, 5};
        insterSort(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    private static void insterSort(int[] arrs) {
        int temp = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrs[j] > arrs[j - 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j - 1];
                    arrs[j - 1] = temp;
                }
            }
        }
    }
}
