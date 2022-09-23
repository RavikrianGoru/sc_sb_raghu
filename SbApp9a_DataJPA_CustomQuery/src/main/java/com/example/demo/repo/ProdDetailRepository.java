package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProdDetail;


public interface ProdDetailRepository extends JpaRepository<ProdDetail, String>{

}
