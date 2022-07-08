package com.msb.kupai.code03;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: MergetSort
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/21   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class MergetSortTest {
    public static void main(String[] args) {
        int[] arrs = {2, 8, 1, 89, 196, 3, 1, 4, 23};
        int[] temp = new int[arrs.length];
        mergeSort(arrs, 0, arrs.length - 1, temp);
        System.out.println(Arrays.toString(arrs));
    }

    private static void mergeSort(int[] arrs, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right)/2;
            mergeSort(arrs, left, mid, temp);
            mergeSort(arrs, mid + 1, right, temp);
            merge(arrs, left, mid, right, temp);

        }

    }

    private static void merge(int[] arrs, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arrs[i] < arrs[j]) {
                temp[t] = arrs[j];
                j += 1;
            } else {
                temp[t] = arrs[i];
                i += 1;
            }
            t += 1;
        }

        while (i <= mid) {
            temp[t] = arrs[i];
            i += 1;
            t += 1;
        }
        while (j <= right) {
            temp[t] = arrs[j];
            j += 1;
            t += 1;
        }
        int leftTemp = left;
        t = 0;
        while (leftTemp <= right) {
            arrs[leftTemp] = temp[t];
            leftTemp += 1;
            t+=1;
        }
    }


}
