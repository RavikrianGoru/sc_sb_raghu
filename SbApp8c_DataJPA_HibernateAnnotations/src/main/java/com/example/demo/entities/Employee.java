package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {

	@Id
	@Column(name = "eid")
	private Integer empId;

	@Column(name = "ename")
	private String empName;

	@Temporal(TemporalType.DATE)
	@Column(name = "doj")
	private Date doj;

	@Temporal(TemporalType.TIME)
	@Column(name = "shift_time")
	private Date shiftTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "login_time")
	private Date loginTime;

	@Column(name = "empsal")
	private Double empSal;

	@Lob //BLOB
	@Column(name = "emp_img")
	private byte[] empImg;

	@Lob //CLOB
	@Column(name = "emp_desc")
	private char[] empDesc;
}
