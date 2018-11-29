package com.ren.li.springday04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring 的注解开发
 * @author renl
 * @date 2018-11-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ATest {
@Resource(name = "orderDao")
    private OrderDemo orderDemo;
    @Test
    public void demo(){
        orderDemo.save();
        orderDemo.find();
        orderDemo.update();
        orderDemo.delete();
    }
}
