package com.example.controller;

import com.example.model.Customer;
import com.example.model.Product;
import com.example.repository.CustomerRepo;
import com.example.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CassandraDataAPI {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ProductRepo productRepo;

    @GetMapping("customer")
    public List<Customer> getResponse(){
        customerRepo.findAll().stream().forEach(System.out::println);

        return customerRepo.findAll();
    }

    @GetMapping("product")
    public List<Product> getProducts(){

        productRepo.findAll().stream().forEach(System.out::println);
        return productRepo.findAll();
    }
}
