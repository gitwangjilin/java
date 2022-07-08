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
public class Code01_SelectionSort {
    public static void main(String[] args) {
        int[] arrs = {2, 8, 96, 89, 196, 3, 1};
//        //选择排序
//        selectSort(arrs);
//        //冒泡排序
        bubblingSort(arrs);
//        //插入排序
//        insertionSort(arrs);
//        select(arrs);
//        selectDigui(arrs, 0);
//        System.out.println(Arrays.toString(arrs));
    }

    private static void selectDigui(int[] args, int posInt) {
        int temp = 0;
        int arrLeng = args.length;
        for (int i = posInt + 1; i < args.length; i++) {
            if (args[posInt] > args[i]) {
                temp = args[posInt];
                args[posInt] = args[i];
                args[i] = temp;
            }
        }
        posInt++;
        if (posInt < arrLeng) {
            selectDigui(args, posInt);
        }
    }

    public static void select(int[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                System.out.println(Arrays.toString(args));

                if (args[i] > args[j]) {
                    swapArr(args, i, j);
                }
            }
            System.out.println();

        }
        System.out.println("------" + Arrays.toString(args));
    }

    private static void swapArr(int[] args, int i, int j) {
        int temp = 0;
        temp = args[i];
        args[i] = args[j];
        args[j] = temp;
        System.out.println("------" + Arrays.toString(args));

    }

    private static void insertionSort(int[] arrs) {
        for (int i = 1; i < arrs.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrs[j] < arrs[j - 1]) {
                    int temp = arrs[j - 1];
                    arrs[j - 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrs));

    }

    private static void bubblingSort(int[] arrs) {
        int temp = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] =temp;
                }

            }

        }
        System.out.println(Arrays.toString(arrs));

    }

    /**
     * 选择排序
     *
     * @param arrs
     */
    private static void selectSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] < arrs[j]) {
                    temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arrs));
    }
}
