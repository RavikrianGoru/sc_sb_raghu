package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//1-Column
	//JPQL/HQP:  select e.empName from Employee e
	@Query("select e.empName from Employee e")
	public List<String> getAllEmpNames();
	
	// >1-Columns
	//JPQL/HQL: select e.empId, e.empName from Employee e where e.empSal>6000.00
	@Query("select e.empId, e.empName from Employee e where e.empSal>6000.00")
	public List<Object[]> getEmpIDEmpNameForSalGt6k();
	
	//All-columns
	//JPQL/HQL: select e from Employee e
	@Query("select e from Employee e") //select * from Employee---> Invalid. here * indicated multiplication in JPA
	public List<Employee> getAllEmployeers();

	
	//Dynamic Inputs through :param
	//JPQL/HQL: select e from Employee e where e.empSal>:sal
	@Query("select e from Employee e where e.empSal>:sal")
	public List<Employee> getAllEmployeersEmpSalGtValue(Double sal);
	
	
	//==========SQL(Not recommended, params can be passes ?1, ?2....etc===========
	@Query(value="SELECT ename FROM emp_tab", nativeQuery = true) 
	List<String> getAllEmpNamesSql();
	
	@Query(value="SELECT ename FROM emp_tab WHERE esal > ?1", nativeQuery = true) 
	List<String> getAllEmpNamesBySalGtSql(Double sal);
	
	
	
	// ========JOINS=========
	
	//Fetch Employees by Department iD.
	
	//@Query("select e.empName,d.depName from Employee e INNER JOIN e.dop as d WHERE d.depId =:did")
	@Query("select e.empName,d.depName from Employee e INNER JOIN e.dop as d ON d.depId =:did")
	public List<Object[]> getEmpIdNameDepNameByDid(Integer did); 
	
}
