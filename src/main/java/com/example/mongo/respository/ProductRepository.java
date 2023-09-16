package com.example.mongo.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
