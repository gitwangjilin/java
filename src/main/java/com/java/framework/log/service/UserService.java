package com.java.framework.log.service;

import com.java.framework.log.dao.UserMapper;
import com.java.framework.log.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> list(){
        return userMapper.findByPhone();
    }


}