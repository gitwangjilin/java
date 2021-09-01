package com.java.framework.log.service;

import com.java.framework.log.dao.UserMapper;
import com.java.framework.log.entity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: UserService
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
@Service
public class UserService implements InitializingBean {
    @Resource
    UserMapper userMapper;

    public List<User> list() {
//        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        System.out.println(userMapper.findByPhone());
        System.out.println(userMapper.findByPhone());
        return userMapper.findByPhone();
    }

    @PostConstruct
    public void init() {
        System.out.println("==========");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("1111111111111111111");
    }
}
