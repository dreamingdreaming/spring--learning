package com.ren.li.demo01.dao;

public interface AccountDao {
    public void outMoney(String from,Double money);
    public void inMoney(String to,Double money);

}
