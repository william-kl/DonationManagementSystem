package com.group3.donationmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String addressOne;
	private String addressTwo;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String urbanization;
	private String password;
	private String role;
	private String cmaNumber;
	
	public User() {}

	public User(String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
			String city, String state, String zipCode, String country, String urbanization, String password,
			String role, String cmaNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.urbanization = urbanization;
		this.password = password;
		this.role = role;
		this.cmaNumber = cmaNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUrbanization() {
		return urbanization;
	}

	public void setUrbanization(String urbanization) {
		this.urbanization = urbanization;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCmaNumber() {
		return cmaNumber;
	}

	public void setCmaNumber(String cmaNumber) {
		this.cmaNumber = cmaNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", addressOne=" + addressOne + ", addressTwo=" + addressTwo + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + ", urbanization="
				+ urbanization + ", password=" + password + ", role=" + role + ", cmaNumber=" + cmaNumber + "]";
	}
	
	
	
}
