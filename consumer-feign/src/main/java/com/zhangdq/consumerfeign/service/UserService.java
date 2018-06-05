package com.zhangdq.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhangdq
 * @Description:
 * @Date: Create in 20:18 2018/6/5
 */
@Service
// value是服务的名称
@FeignClient(value = "PROVIDER-TICKET",fallback = UserServiceFailure.class)
public interface UserService {
    //这里映射的地址是服务的路径
    @GetMapping("/ticket")
    public String buyTicket();
}
