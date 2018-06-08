package com.zhangdq.consumerfeign.controller;

import com.zhangdq.consumerfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangdq
 * @Description:
 * @Date: Create in 20:20 2018/6/5
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/buy2")
    public String  buyTicket(String name){

        return name + " meile " + userService.buyTicket();
    }
    @RequestMapping("/aa")
    public String aa(){
        return "aaaa";
    }
}
