package com.southwind.controller;

import com.southwind.entity.Admin;
import com.southwind.entity.Order;
import com.southwind.entity.OrderVO;
import com.southwind.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Value("${server.port}")
private  String port;
@GetMapping("/index")
    public String index(){
        return "order的端口:"+this.port;
    }


}

