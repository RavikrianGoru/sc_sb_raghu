package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courcetab")
public class Cource {

	@Id
	@Column(name = "cid")
	private Integer courcetId;
	
	@Column(name = "cname")
	private String courceName;
	
	@Column(name = "cfee")
	private Double courceFee;

}
