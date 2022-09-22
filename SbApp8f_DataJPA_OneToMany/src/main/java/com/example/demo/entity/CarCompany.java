package com.example.demo.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="car_company_tab")
public class CarCompany {
	
	@Id
	@Column(name="cid")
	private Integer companyId;

	@Column(name="cname")
	private String companyName;
	
	@Column(name="cbase_location")
	private String baseLocation;

	@Temporal(TemporalType.DATE)
	@Column(name="est_date")
	private Date establishmentDate;
	
	@OneToMany
	@JoinColumn(name="midFK")
	private Set<CarModel> models;

}
