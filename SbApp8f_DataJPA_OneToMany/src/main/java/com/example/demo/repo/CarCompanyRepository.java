package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarCompany;

public interface CarCompanyRepository extends JpaRepository<CarCompany, Integer> {

}
