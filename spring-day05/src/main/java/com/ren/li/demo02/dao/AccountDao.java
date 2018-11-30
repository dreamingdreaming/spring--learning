package com.ren.li.demo02.dao;


public interface AccountDao {
    public void outMoney(String from, Double money);
    public void inMoney(String to, Double money);

}
