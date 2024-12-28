package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.model.Doctor;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MedicalRecordDto {

	private Long id;
	
	private long patientId;
	
    private LocalDate visitDate;
	
	private String diagnosis;
	
	private String treatment;
	
	private String prescription;
	
	private long doctorId;
	
	private String password;

	public MedicalRecordDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalRecordDto(Long id, long patientId, LocalDate visitDate, String diagnosis, String treatment,
			String prescription, long doctorId, String password) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.visitDate = visitDate;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.prescription = prescription;
		this.doctorId = doctorId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
