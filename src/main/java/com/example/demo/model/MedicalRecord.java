package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="MedicalRecord")
public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="PatientId" ,nullable=false)
	private long patientId;
	
	@Column(name="VisitDate",nullable=false)
	private LocalDate visitDate;
	
	@Column(name="Diagnosis",nullable=false)
	private String diagnosis;
	
	@Column(name="Treatment",nullable=false)
	private String treatment;
	
	@Column(name="Prescription",nullable=false)
	private String prescription;
	
	@ManyToOne(targetEntity = Doctor.class)
	@JoinColumn(name="Doctor", referencedColumnName = "id" ,nullable=false)
	private long doctorId;

	@Column(name="Password",nullable=false)
	private String password;

	public MedicalRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalRecord(long id, long patientId, LocalDate visitDate, String diagnosis, String treatment,
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
