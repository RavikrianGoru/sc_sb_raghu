package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	
	@ManyToOne
	@JoinColumn(name="didFK")
	private Department dop;//Has-a Relation
	
}
