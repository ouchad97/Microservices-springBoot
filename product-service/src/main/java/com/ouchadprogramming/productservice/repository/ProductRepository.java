package com.ouchadprogramming.productservice.repository;

import com.ouchadprogramming.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
