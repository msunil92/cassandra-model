package com.example.repository;

import com.example.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepo extends CassandraRepository<Product, String> {

}
