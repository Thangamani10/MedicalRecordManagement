package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientDto;
import com.example.demo.model.Patient;

@Service
public interface PatientService {

	public Patient createPatient(Patient patient);

	public List<Patient> getPatient();

	public List<Patient> getPatientByNameAndGender(String patientName, String gender);

	public List<Patient> getPatientByNameAndPassword(String patientName, String password);

	public Patient sigin(PatientDto patients) throws Exception;

	public boolean deletePatient(long id);

}
