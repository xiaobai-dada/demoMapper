package com.hc.git.controller;


import com.hc.git.bean.UserInfo;
import com.hc.git.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    // 调用服务层
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    // 数据应该从前台页面过来
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){

        userInfo.setLoginName("wocac");
        userInfo.setPasswd("666666");

        userService.addUser(userInfo);
        System.out.println(userInfo.getId());
    }

    @RequestMapping("updById")
    public String updById(UserInfo userInfo){
        userInfo.setName("|妈的哈哈哈|");
        userInfo.setId("5");

        userService.updUser(userInfo);
        return "OK";
    }

    @RequestMapping("updByName")
    public String updByName(UserInfo userInfo){
        userInfo.setName("|妈的哈哈哈|");
        userInfo.setLoginName("|妈的又哈哈哈哈|");

        userService.updUserByName(userInfo);
        return "OK";
    }

    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByName")
    public String delUserByName(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByNickName")
    public String delUserByNickName(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }
}
