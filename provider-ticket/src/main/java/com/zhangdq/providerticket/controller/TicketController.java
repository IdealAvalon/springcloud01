package com.zhangdq.providerticket.controller;

import com.zhangdq.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangdq
 * @Description:
 * @Date: Create in 19:34 2018/6/5
 */
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @Value("${server.port}")
    String port;
    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket()+port;
    }
}
