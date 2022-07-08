package com.msb.kupai.code03;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: QuickSort
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
public class QuickSort {
    public static void main(String[] args) {
        int[] arrs = {3, 5, 1, 78, 3, 23, 23};
        quickSort(arrs, 0, arrs.length-1);
        System.out.println(Arrays.toString(arrs));
    }

    private static void quickSort(int[] arrs, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arrs[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arrs[l] < pivot) {
                l += 1;
            }
            while (arrs[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            temp = arrs[l];
            arrs[l] = arrs[r];
            arrs[r] = temp;
            if (arrs[l] == pivot) {
                r -= 1;
            }
            if (arrs[r] == pivot) {
                l += 1;
            }
            if (left < r) {
                quickSort(arrs, left, r);
            }
            if (right < l) {
                quickSort(arrs, l, right);
            }
        }
    }
}

