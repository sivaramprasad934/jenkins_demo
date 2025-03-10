package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Product;
import com.wipro.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

}
