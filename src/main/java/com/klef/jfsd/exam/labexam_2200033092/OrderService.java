package com.klef.jfsd.exam.labexam_2200033092;


import com.klef.jfsd.exam.labexam_2200033092.Order;
import com.klef.jfsd.exam.labexam_2200033092.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
