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
public class MergetSortSum {
    public static void main(String[] args) {
        int[] arrs = {2, 4, 1,32,12,1,42};
        int[] temp = new int[arrs.length];
        int i = mergeSort(arrs, 0, arrs.length - 1, temp);
        System.out.println(i);
        System.out.println(Arrays.toString(arrs));
    }

    private static int mergeSort(int[] arrs, int left, int right, int[] temp) {
        if (left < right) {
            System.out.println("数组：" + Arrays.toString(arrs) + "    left:" + left + "    right:" + right + "    temp:" + Arrays.toString(temp));
            int mid = (left + right) / 2;
            System.out.println("left===========================left");
            return mergeSort(arrs, left, mid, temp) + mergeSort(arrs, mid + 1, right, temp) + merge(arrs, left, mid, right, temp);
        }
        return 0;
    }

    private static int merge(int[] arrs, int left, int mid, int right, int[] temp) {
        System.out.println("merge");
        System.out.println("数组：" + Arrays.toString(arrs) + "    left:" + left + "mid:" + mid + "    right:" + right + "    temp:" + Arrays.toString(temp));
        int i = left;
        int j = mid + 1;
        int t = 0;
        int sum = 0;
        while (i <= mid && j <= right) {
            System.out.println( arrs[i]+"============================================="+ arrs[j]);
            sum += arrs[i] < arrs[j] ? (right - mid + 1) * arrs[i] : 0;
            if (arrs[i] <= arrs[j]) {
                temp[t] = arrs[i];
                t += 1;
                i += 1;
            } else {
                temp[t] = arrs[j];
                t += 1;
                j += 1;
            }
        }
        while (i <= mid) {
            temp[t] = arrs[i];
            t += 1;
            i += 1;
        }
        while (j <= right) {
            temp[t] = arrs[j];
            t += 1;
            j += 1;
        }
        t = 0;
        int leftTemp = left;
        while (leftTemp <= right) {
            arrs[leftTemp] = temp[t];
            t += 1;
            leftTemp += 1;
        }
        return sum;
    }

}
