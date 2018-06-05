package com.zhangdq.consumerfeign.service;

import org.springframework.stereotype.Component;

/**
 * @author: zhangdq
 * @Description:
 * @Date: Create in 20:42 2018/6/5
 */

//不要忘记将断路器类添加到spring容器中！
@Component
public class UserServiceFailure implements UserService{
    @Override
    public String buyTicket() {
        return "UserService is not available!";
    }
}
