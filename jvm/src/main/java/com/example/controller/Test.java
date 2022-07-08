package com.example.controller;


import com.shangzhao.sm3sdk.utils.GMUtil;
import com.shangzhao.sm3sdk.utils.SM3Hash;

import java.util.Base64;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: TestC
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/3/14   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Test {
    public static void main(String[] args) {
        final Base64.Decoder decoder = Base64.getDecoder();

        try {
            System.out.println(GMUtil.getSM3Hash("410823199405220171"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
