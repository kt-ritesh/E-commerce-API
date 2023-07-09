package com.geekster.Ecommerce.API.services;

import com.geekster.Ecommerce.API.models.ProductModel;
import com.geekster.Ecommerce.API.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;
    public List<ProductModel> getAllProductNow(String productCategory) {
        return productRepository.basedOnCategory(productCategory);
    }

    public String saveProduct(ProductModel product) {
        productRepository.save(product);
        return "Product saved Successfully!!";
    }

    public String deleteProductNow(int productId) {
        productRepository.deleteById(productId);
        return "Product id " +productId+ " deleted!!";
    }
}
