package com.ren.li.impl;

import com.ren.li.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void transper() {
        accountService.transper("renl","renl02",2000d);

    }
}