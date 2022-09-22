package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenttab")
public class Student {

	@Id
	@Column(name = "sid")
	private Integer studentId;
	
	@Column(name = "sname")
	private String studentName;

	@ManyToMany
	@JoinTable(
			name = "stud_join_cour_tab", 
			joinColumns = @JoinColumn(name = "sidFK"), 
			inverseJoinColumns = @JoinColumn(name = "cidFK")
	)
	private Set<Cource> cources;
}
