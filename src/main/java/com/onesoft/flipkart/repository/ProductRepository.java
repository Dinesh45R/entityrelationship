package com.onesoft.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.flipkart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
