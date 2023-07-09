package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.models.ProductModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<ProductModel , Integer> {
    @Query(value = "select * from product_model where product_category = :productCategory" , nativeQuery = true)
    List<ProductModel> basedOnCategory(String productCategory);
}
