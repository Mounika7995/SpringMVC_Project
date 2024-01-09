package com.feuji.bean;

import javax.validation.constraints.NotBlank;

public class FeujiSolutions {
	
	@NotBlank(message = "It is required")
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

	@Override
	public String toString() {
		return "FeujiSolutions [company_Name=" + company_Name + ", NumberOfEmp=" + NumberOfEmp + ", location="
				+ location + "]";
	}
	
}
