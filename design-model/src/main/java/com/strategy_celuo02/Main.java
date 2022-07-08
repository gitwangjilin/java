package main.java.com.strategy_celuo02;

import java.util.Arrays;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Main
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 * 策略模式
 * - History:
 * Date        Author          Modification
 * 2022/6/16   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Main {
    public static void main(String[] args) {
//        int[] a = {9, 2, 4, 7, 1, 4};
        Dog[] cat = {new Dog(2), new Dog(13), new Dog(13)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(cat, new DogComparator());
        System.out.println(Arrays.toString(cat));
    }
}
