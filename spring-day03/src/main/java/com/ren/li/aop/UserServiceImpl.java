package com.ren.li.aop;

import com.ren.li.demo01.service.UserService;

/**
 * @author renl
 * @date 2018-11-28
 */
public class UserServiceImpl implements UserService {
    public void save() {
        System.out.println("保存用户");
    }
    public void update() {
        System.out.println("修改用户");
    }
    public void delete() {
        System.out.println("删除用户");
    }
    public String  select() {
        System.out.println("查询用户");
        return "renl";
    }
}
