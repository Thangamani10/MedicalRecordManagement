package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name="patientName",nullable=false)
	private String patientName;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Contact")
	
	private String contact;
	
	@Column(name="Address")
	
	private String address;

	@Column(name="Password")
    
	private String password;
	
//	Default Constructor;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	Parameterized Constructor;
	

	public Patient(long id, String patientName, String gender, int age, String contact, String address,String password) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.password=password;
	}

	
//	Getter And Setter Method;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
