package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.Product;
import com.wipro.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

}
