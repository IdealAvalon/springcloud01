package com.zhangdq.providerticket2.controller;

import com.zhangdq.providerticket2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
