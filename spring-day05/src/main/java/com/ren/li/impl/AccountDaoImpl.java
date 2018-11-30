package com.ren.li.impl;

import com.ren.li.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账dao的实现类
 *
 * @author renl
 * @date 2018-11-30
 */

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /*    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/
    /*jdbc模板*/
    public void outMoney(String from, Double money) {
        this.getJdbcTemplate().update("update  account set money = money - ? where  name  = ?",money,from);
    }
    public void inMoney(String to, Double money) {
        this.getJdbcTemplate().update("update  account set money = money + ? where  name  = ?",money,to);
    }
}
