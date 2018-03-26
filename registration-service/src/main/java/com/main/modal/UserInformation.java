package com.main.modal;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Document(collection = "userInformation")
@ApiModel(description="All details about the user. ")
public class UserInformation {

	@Id
	private String userId;
	@Size(min=2,max=8,message="User Name should be atleast of length 2 and max of length 8")
	@NotNull
	@ApiModelProperty(notes="Name should have atleast 2 characters")
	private String userName;
	private String city;
	//date of birth should be in the past	
	@Past (message="Only the past is valid")
	@ApiModelProperty(notes="Birth date should be in the past")
	private Date dateOfBirth;
	private String educationQualification;
	@Size(min=6,max=12,message="Password should be atleast of length 6 and max of length 12")
	private String password;
	@Min(18)
	private int age;

	public UserInformation() {
		super();

	}

	public UserInformation(@NotNull String userId,
			@Size(min = 2, max = 8, message = "User Name should be atleast of length 2 and max of length 8") @NotNull String userName,
			String city, @Past Date dateOfBirth, String educationQualification,
			@Size(min = 6, max = 12, message = "Password should be atleast of length 6 and max of length 12") String password,
			@Min(18) int age) {
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
