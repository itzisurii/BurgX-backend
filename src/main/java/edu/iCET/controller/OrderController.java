package edu.iCET.controller;

import edu.iCET.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public String loadOrder(){

        return "Load Order Controller...";
    }

    @GetMapping("/lastId")
    public int getLastOrderId(){

        return orderService.getLastOrderId();
    }



}
