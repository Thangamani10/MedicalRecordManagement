package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientDto;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImple implements PatientService {

	public PatientServiceImple() {
		super();
	}

	@Autowired

	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient sigin(PatientDto patients) throws Exception {
		// TODO Auto-generated method stub
		try {
			return patientRepository.findByPatientNameAndPassword(patients.getPatientName(), patients.getPassword());

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			throw new Exception("Invalid Patient");
		}
	}

	@Override
	public boolean deletePatient(long id) {

		try {
			patientRepository.deleteById(id);
			return true;
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public List<Patient> getPatientByNameAndGender(String patientName, String gender) {
		// TODO Auto-generated method stub
		return (List<Patient>) patientRepository.findByPatientNameAndGender(patientName, gender);
	}

	@Override
	public List<Patient> getPatientByNameAndPassword(String patientName, String password) {
		// TODO Auto-generated method stub
		return (List<Patient>) patientRepository.findByPatientNameAndGender(patientName, password);
	}

}
