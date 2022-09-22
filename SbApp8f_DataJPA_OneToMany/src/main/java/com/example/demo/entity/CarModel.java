package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="car_model_tab")
public class CarModel {

	@Id
	@Column(name="mid")
	private Integer modelId;;

	@Column(name="mname")
	private String modelName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="relese_date")
	private Date releaseDate;
	
	@Column(name="price")
	private Double price;
}
