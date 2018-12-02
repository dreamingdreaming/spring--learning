package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void insert() {

    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {

        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void updateByPrimaryKey() {
    }
}