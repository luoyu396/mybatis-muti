package com.example.mybatismuti.db2.service;

import com.example.mybatismuti.bean.Money;
import com.example.mybatismuti.db2.dao.MoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanbb
 * @create 2022-01-26
 */
@Service
public class MoneyService {

    @Autowired
    private MoneyDao moneyDao;

    /**
     * 根据名字查找用户
     */
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }

}
