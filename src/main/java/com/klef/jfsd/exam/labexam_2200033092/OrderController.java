package com.klef.jfsd.exam.labexam_2200033092;



import com.klef.jfsd.exam.labexam_2200033092.Order;
import com.klef.jfsd.exam.labexam_2200033092.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
