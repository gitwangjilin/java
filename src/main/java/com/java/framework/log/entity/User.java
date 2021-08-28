package com.java.framework.log.entity;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: User
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
public class User {
    /**
     * 唯一id
     */
    private String id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * vip
     */
    private Integer vip;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像url
     */
    private String imageUrl;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 签名
     */
    private String sign;

    /**
     * 到期时间
     */
    private String timeLimit;
}
