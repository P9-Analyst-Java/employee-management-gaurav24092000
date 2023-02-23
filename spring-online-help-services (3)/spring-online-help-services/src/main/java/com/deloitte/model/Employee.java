package com.deloitte.model;

import java.util.Objects;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Employee {
	
	
	@NotBlank(message="User Name cannot be blank")
	private String name;
	
	@Size(min=10, max=10, message="Contact Number should be of 10 digits")
	private String contactNumber;
	
	@NotBlank(message="Email ID cannot be blank")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Email ID should be of proper format")
	private String email;
	
	@NotBlank(message="Confirm Email ID cannot be blank")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Email ID should be of proper format")
	private String confirmEmail;
	
	@NotBlank
	private String agree;
	
	@AssertTrue(message="Confirm Email ID and Email ID should be the same")
	public boolean isEmailMatching() {
		
		return Objects.equals(email, confirmEmail);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}


	public String getAgree() {
		return agree;
	}


	public void setAgree(String agree) {
		this.agree = agree;
	}


	
	
	
	
	
}
