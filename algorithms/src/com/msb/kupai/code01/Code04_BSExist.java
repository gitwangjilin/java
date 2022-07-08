package com.msb.kupai.code01;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code04_BSExist
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
public class Code04_BSExist {
    public static void main(String[] args) {
        int a = 3;
        int c = 33;
        System.out.println(5>>1);
        a = a ^ c;
        System.out.println(a);
        c = a ^ c;
        System.out.println(c);
        a = a ^ c;
        System.out.println(a);
        System.out.println(c & (~c + 1));
        System.out.println(c & (-c + 1));
    }
}
