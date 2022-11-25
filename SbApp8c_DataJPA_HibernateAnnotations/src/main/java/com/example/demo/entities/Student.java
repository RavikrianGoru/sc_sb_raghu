package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.entities.enums.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_tab")
public class Student {

	@Id
	@Column(name="sid")
	private Integer sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name = "doj")
	private LocalDate modelDate;

	@Column(name = "expire_time")
	private LocalDateTime expireTime;
	
	@Column(name ="own_vehicle")
	private Vehicle ownVehicle;
}
