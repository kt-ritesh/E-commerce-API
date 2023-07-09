package com.geekster.Ecommerce.API.controllers;

import com.geekster.Ecommerce.API.models.OrderModel;
import com.geekster.Ecommerce.API.models.ProductModel;
import com.geekster.Ecommerce.API.models.UserModel;
import com.geekster.Ecommerce.API.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping(value = "/order")
    public String order(@RequestBody OrderModel orderModel){

        return orderService.productOrder(orderModel);
    }
    @GetMapping(value = "/getProductByOrderId/{orderId}")
    public ProductModel getProductByOrderId(@PathVariable int orderId){
       return orderService.getProductByOrderIdtNow(orderId);
    }

    @GetMapping(value = "/getByUserId/{userId}")
    public UserModel getByUserId(@PathVariable int userId){
        return orderService.getByUserIdNow(userId);
    }


}
