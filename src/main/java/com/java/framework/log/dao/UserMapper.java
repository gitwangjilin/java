package com.java.framework.log.dao;

import com.java.framework.log.entity.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*************************************************************************
 ******
 * - Copyright (c) 2021 aip
 * - File Name: UserMapper
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/1/23   WangJiLin     Create the current class
 *************************************************************************
 ******/
@CacheNamespace
public interface UserMapper {

    /**
     * 查询手机号
     *
     * @return
     */
    @Select("select * from User ")
    List<User> findByPhone();

}
