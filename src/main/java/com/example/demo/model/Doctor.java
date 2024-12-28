package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="DoctorName")
	private String doctorName;
	
	@Column(name="Speciallization")
	private String speciallization;
	
	@Column(name="Password")
	
	private String password;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long id, String doctorName, String speciallization, String password) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.speciallization = speciallization;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciallization() {
		return speciallization;
	}

	public void setSpeciallization(String speciallization) {
		this.speciallization = speciallization;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 
	
	
}
