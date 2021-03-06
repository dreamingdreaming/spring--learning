package com.ren.li.demo01.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void demo01() {
        userService.save();
        userService.select();
        userService.update();
        userService.delete();

    }
}