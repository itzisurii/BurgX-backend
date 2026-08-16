package edu.iCET.service;

import edu.iCET.repository.OrderRepository;

public class OrderService {

    OrderRepository orderRepository;

    public int getLastOrderId() {

        return orderRepository.findLastOrderId();
    }
}
