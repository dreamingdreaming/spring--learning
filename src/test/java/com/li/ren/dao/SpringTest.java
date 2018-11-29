package com.li.ren.dao;

import com.li.ren.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class SpringTest {

    /*传统方式*/
    @Test
    public void save() {
        UserDao userDao = new UserDaoImpl();
        userDao.save();
    }
    /*Spring方式调用*/
    @Test
    public void savespring(){
        /*创建Spring的工厂*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDAO");
        userDao.save();
    }
}