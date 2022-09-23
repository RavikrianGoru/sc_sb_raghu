package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Department;

public interface DeparmentRepo extends JpaRepository<Department, Integer> {

}
