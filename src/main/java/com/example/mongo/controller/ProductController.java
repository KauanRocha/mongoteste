package com.example.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.model.Product;
import com.example.mongo.respository.ProductRepository;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	@Autowired 
	private ProductRepository productRepository;

	@PostMapping
	public Product create(@RequestBody Product productRequest) {
		var product = new Product(productRequest.getName(), productRequest.getCategory());
		
		return productRepository.save(product);
	}
}
