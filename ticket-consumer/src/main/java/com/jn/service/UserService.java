package com.jn.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Reference
    private TicketService ticketService;

    public void userGetTicket() {
        System.out.println("恭喜成功地购买了"+ticketService.getTicket());
    }

}
