package com.ren.li.springday04;

/**
 * 订单
 *
 * @author renl
 * @date 2018-11-29
 */
public class OrderDemo {
    public void save(){
        System.out.println("保存订单");
    }
    public String delete(){
        System.out.println("删除订单");
        return "删除成功";
    }
    public void find(){
        System.out.println("查询订单");
    }
    public void update(){
        System.out.println("更新订单");
    }
}
