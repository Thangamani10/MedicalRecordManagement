package com.example.demo.dto;

public class PatientDto {

	private long id;
	
	private String patientName;
	
	private String gender;
	
	private int age;
	
	private String contact;
	
	private String address;
	
	private String password;

	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDto(long id, String patientName, String gender, int age, String contact, String address,String password) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.password=password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
