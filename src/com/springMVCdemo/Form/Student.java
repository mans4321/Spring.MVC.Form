package com.springMVCdemo.Form;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private LinkedHashMap<String, String> countryOption;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public Student() {
		countryOption = new LinkedHashMap<String, String>();
		countryOption.put("KSA", "Saudi Araba");
		countryOption.put("Ch", "China");
		countryOption.put("IN", "India"); 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(LinkedHashMap<String, String> country) {
		this.countryOption = country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}
