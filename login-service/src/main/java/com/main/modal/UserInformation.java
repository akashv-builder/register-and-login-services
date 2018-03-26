package com.main.modal;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserInformation {

	private String userId;

	private String userName;
	private String city;
	
	private Date dateOfBirth;
	private String educationQualification;
	
	private String password;
	private int age;

	public UserInformation() {
		super();

	}
	
	public UserInformation(String userId, String userName, String city, Date dateOfBirth, String educationQualification,
			String password, int age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.educationQualification = educationQualification;
		this.password = password;
		this.age = age;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Topic [userId=" + userId + ", userName=" + userName + ", city=" + city + ", dateOfBirth=" + dateOfBirth
				+ ", educationQualification=" + educationQualification + ", password=" + password + ", age=" + age
				+ "]";
	}



}
