package com.example.demo.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.db1.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
