package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	List<Patient> findById(long id);

	Patient findByPatientNameAndGender(String patientName, String gender);

	Patient findByPatientNameAndPassword(String patientName, String password);

}
