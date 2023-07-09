package com.geekster.Ecommerce.API.services;

import com.geekster.Ecommerce.API.repository.IOrderRepository;
import com.geekster.Ecommerce.API.models.OrderModel;
import com.geekster.Ecommerce.API.models.ProductModel;
import com.geekster.Ecommerce.API.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public String productOrder(OrderModel orderModel) {

        orderRepository.save(orderModel);

        return "Orderd Successfull!";
    }

    public ProductModel getProductByOrderIdtNow(int orderId) {
        Optional<OrderModel> OptionalObj = orderRepository.findById(orderId);
        ProductModel productObj =OptionalObj.get().getProductModel();
        return productObj;
    }

    public UserModel getByUserIdNow(int userId) {
        Optional<OrderModel> OptionalObj = orderRepository.findById(userId);
        UserModel userObj =OptionalObj.get().getUserModel();
        return userObj;
    }


}
