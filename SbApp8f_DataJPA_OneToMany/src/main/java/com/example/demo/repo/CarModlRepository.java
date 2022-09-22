package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarModel;

public interface CarModlRepository extends JpaRepository<CarModel, Integer> {

}
