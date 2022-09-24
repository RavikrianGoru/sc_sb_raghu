package com.example.demo.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.db2.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
