package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
