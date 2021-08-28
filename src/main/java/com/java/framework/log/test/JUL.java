package com.java.framework.log.test;

import java.util.logging.Logger;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: JUL
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
public class JUL {
    public static void main(String[] args) {
        Logger logger= Logger.getLogger("jul");
        logger.info("jul");
    }
}
