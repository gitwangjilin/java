package com.java.framework.log.app;


import ch.qos.logback.core.db.DriverManagerConnectionSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Appconfig
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/8/26   WangJiLin     Create the current class
 *************************************************************************
 ******/
@Configuration
@ComponentScan("com.java.framework.log")
@MapperScan("com.java.framework.log.dao")
public class Appconfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setPassword("root");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/ocr?DATABASENAME&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return  dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        sqlSessionFactoryBean.setConfiguration(configuration);
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
}
