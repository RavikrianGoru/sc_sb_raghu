package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//====inner Join====

	@Query("select p.prodId, pd.prodName, pd.prodPrice from Product p inner join ProdDetail pd on p.prodCode = pd.prodCode")
	public List<Object[]> getDataInnerJoin(); 
	
	@Query("select p.prodId, pd.prodName, pd.prodPrice from Product p left outer join ProdDetail pd on p.prodCode = pd.prodCode")
	public List<Object[]> getDataLeftOuterJoin(); 
	
	@Query("select p.prodId, pd.prodName, pd.prodPrice from Product p right outer join ProdDetail pd on p.prodCode = pd.prodCode")
	public List<Object[]> getDataRightOuterJoin(); 
	
	
	//@Query("select p.prodId, pd.prodName, pd.prodPrice from Product p full outer join ProdDetail pd on p.prodCode = pd.prodCode")
	//public List<Object[]> getDataFullOuterJoin(); 
	

}
