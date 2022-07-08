package main.java.com.strategy_celuo02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Sorter
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
public class Sorter<T> {

    public void sort(T[] arr, Comparator comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = 0;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arrs, int i, int j) {
        T temp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = temp;
    }
}
