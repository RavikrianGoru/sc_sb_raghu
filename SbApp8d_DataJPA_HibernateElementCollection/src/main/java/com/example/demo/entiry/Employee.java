package com.example.demo.entiry;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	//Parent Table
	@Id //PK
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	
	//Child Table-1 with 3 columns (joinColumn, index,element)
	@ElementCollection
	@CollectionTable(
			name="emp_versions", 
			joinColumns = @JoinColumn(name="eid")
			)
	@OrderColumn(name="epos")
	@Column(name="eversion")
	private List<String> versions;
	
	//Child Table-2 with 2 columns (joinColumn, index,element)
	@ElementCollection
	@CollectionTable(
			name="emp_projects",
			joinColumns = @JoinColumn(name="eid")
			)
	@Column(name="proj")
	private Set<String> projects;
	
	@ElementCollection
	@CollectionTable(
			name="emp_clients",
			joinColumns = @JoinColumn(name="eid")
			)
	@MapKeyColumn(name="clientKey")
	@Column(name="clientName")
	private Map<String,String> clients;
}
