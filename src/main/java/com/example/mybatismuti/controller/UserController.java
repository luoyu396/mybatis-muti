package com.example.mybatismuti.controller;

import com.example.mybatismuti.bean.Money;
import com.example.mybatismuti.bean.User;
import com.example.mybatismuti.db1.service.UserService;
import com.example.mybatismuti.db2.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tanbb
 * @create 2022-01-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/queryMoney")
    public Money testQuery1() {
        return moneyService.selectMoneyById(1);
    }

    @RequestMapping("/queryUser")
    public User testQuery2() {
        return userService.selectUserByName("Daisy");
    }

    @RequestMapping("/insert")
    public List<User> testInsert() {
        userService.insertService();
        return userService.selectAllUser();
    }

    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        userService.deleteService(3);
        return "OK";
    }

}
