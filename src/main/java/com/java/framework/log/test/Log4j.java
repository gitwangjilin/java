package com.java.framework.log.test;


import org.apache.log4j.Logger;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Log4j
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
public class Log4j {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger("log4j");
        logger.info("log4j");
    }
}
