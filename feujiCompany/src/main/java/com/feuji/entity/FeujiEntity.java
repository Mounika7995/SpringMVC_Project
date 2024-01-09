package com.feuji.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="FeujiEnity")
public class FeujiEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String company_Name;

	private Integer NumberOfEmp;

	private String location;

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public Integer getNumberOfEmp() {
		return NumberOfEmp;
	}

	public void setNumberOfEmp(Integer numberOfEmp) {
		NumberOfEmp = numberOfEmp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
