package com.juc.thread;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*************************************************************************
 ******
 * - Copyright (c) 2020 redshield.com
 * - File Name: DateUtil
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2020/12/11   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class DateUtil {

    /**
     * 验证响应时间 格式：1607594670000
     * 响应：时间格式 2020-12-31 10:07:18
     *
     * @param time
     * @return
     */
    public static String getOperTime(String time) {
        final SimpleDateFormat operTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isEmpty(time)) {
            Date date = new Date();
            return operTime.format(date.getTime());
        }
        return operTime.format(Long.valueOf(time));
    }
    public static void main(String[] args) {

        String dataStr = "s\\nr";
//        String dataStr = "s\\\\rn";
        String dataStrs = "s\nr";
        dataStr = dataStr.replaceAll("\\\\n","");
        System.out.println(dataStr);
        dataStr = dataStr.replaceAll("\\\\r","");
        System.out.println(dataStr);
//        System.out.println(dataStr.replaceAll("\\\\n",""));
//        System.out.println(dataStr.replaceAll("\\\\r",""));
//        System.out.println(dataStr.replaceAll("\\\\",""));
        System.out.println(dataStrs.replaceAll("\n","")
                .replaceAll("\r","")
                .replaceAll("\\\\", ""));
//        dataStr = dataStr.replaceAll("\n","")
//                .replaceAll("\r","")
//                .replaceAll("\\\\", "");
//        System.out.println(dataStr);
//        System.out.println(dataStr);
    }
    //MEUCIQDf6AX4RlOOq83inssoH/PIwdZUA8E8PZR/VfkVvTZMhwIgWkVD3oxInOBGX8Y6XcYzYx2srJ3QCHfXtT0fZ2LVQnI=
    /**
     * 验证响应时间 格式：20201230173548
     * 响应：时间格式 2020-12-31 10:07:18
     *
     * @param time
     * @return
     */
    public static String getDate(String time) {
        final SimpleDateFormat operTimes = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final SimpleDateFormat sdfs = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            if (StringUtils.isEmpty(time)) {
                Date date = new Date();
                return operTimes.format(date.getTime());
            }
            Date date = sdfs.parse(time);
            return operTimes.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 前置系统返回当前系统时间
     * 响应：时间格式 2020-12-31 10:07:18
     *
     * @param time
     * @return
     */
    public static String getFrontendPresentDate(Date time) {
        final SimpleDateFormat operTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isEmpty(time)) {
            Date date = new Date();
            return operTime.format(date.getTime());
        }
        return operTime.format(time);
    }

    /**
     * 生成图片时间
     * 响应：时间格式：2020年12月31日10时27分23秒
     *
     * @param time
     * @return
     */
    public static String getImagetime(Date time) {
        final SimpleDateFormat operTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final SimpleDateFormat imagetime = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        if (StringUtils.isEmpty(time)) {
            Date date = new Date();
            return operTime.format(date.getTime());
        }
        return imagetime.format(time);
    }

}