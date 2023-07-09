package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.models.OrderModel;
import com.geekster.Ecommerce.API.models.ProductModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends CrudRepository<OrderModel , Integer> {

}
