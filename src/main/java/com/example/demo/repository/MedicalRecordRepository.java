package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MedicalRecord;
import com.example.demo.model.Patient;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

	

	

	MedicalRecord findByPatientIdAndPassword(long patientId, String password);

}
