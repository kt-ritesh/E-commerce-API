package com.geekster.Ecommerce.API.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_user")
    private UserModel userModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_product")
    private ProductModel productModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_address")
    private AddressModel addressModel;
    private int productQuantity;



}
