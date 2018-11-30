package com.ren.li.demo01;

import com.ren.li.demo01.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void transper() {
        accountService.transper("renl02","renl",2000d);
    }
}