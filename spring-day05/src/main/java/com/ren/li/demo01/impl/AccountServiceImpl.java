package com.ren.li.demo01.impl;

import com.ren.li.demo01.dao.AccountDao;
import com.ren.li.demo01.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账的实现类
 *
 * @author renl
 * @date 2018-11-30
 */
public class AccountServiceImpl implements AccountService {
    /**
    *from：转出账号
     * to：转入账号
     * money：转账金额
     *
     *
     * */
    private AccountDao accountDao;
    /**
     *注入事务管理的模板
     *
     * */
    private TransactionTemplate transactionTemplate;
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transper(final String from, final String to, final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(from,money);
                accountDao.inMoney(to,money);
            }
        });
    }
}
