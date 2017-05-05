package com.internetshop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class maker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String name;
//	@Column(unique=true)
//	private Country country;
	
	@ManyToOne
	private Country country;
	
	@OneToMany (mappedBy = "maker")
	List<ComputerComodity> computerComodities;
	@OneToMany (mappedBy = "maker")
	List<householdAppliances> householdAppliances;
	
	
	
	public maker() {
		// TODO Auto-generated constructor stub
	}
	public maker(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Country getCountry() {
//		return country;
//	}
//	public void setCountry(Country country) {
//		this.country = country;
//	}

	

}
