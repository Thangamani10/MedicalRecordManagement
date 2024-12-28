package com.example.demo.dto;

public class DoctorDto {

	
	private long id;
	
	private String doctorName;
	
	private String  speciallization;
	
	private String password;

	
	
	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DoctorDto(long id, String doctorName, String speciallization, String password) {
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



	public void setSpecialization(String speciallization) {
		this.speciallization = speciallization;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
