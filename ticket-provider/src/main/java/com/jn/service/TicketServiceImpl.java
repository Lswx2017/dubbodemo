package com.jn.service;


import org.apache.dubbo.config.annotation.Service;


@Service
public class TicketServiceImpl  implements TicketService  {

    @Override
    public String getTicket() {
        return "阿里点附近拉水电费拉的屎了附件";
    }
}
