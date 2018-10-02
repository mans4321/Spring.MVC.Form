package com.springMVCdemo.Form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message="is Requied")
	@Min(value= 0 , message="must be larger than or equal 0")
	@Max(value= 0 , message="must be smaller than or equal 10")
	private Integer freePass;
	
	@NotNull(message="is Requied")
	@Size(min=1)
	private String lastName;
	
	@CourseCode
	private String courseCode;
	
	public Customer(){}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstNAme(String firstNAme) {
		this.firstName = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
