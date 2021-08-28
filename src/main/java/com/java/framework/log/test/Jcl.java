package com.java.framework.log.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Jcl
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/8/28   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Jcl {
    public static void main(String[] args) {
        Log jcl = LogFactory.getLog("jcl");
        jcl.info("jcl");
    }
}
