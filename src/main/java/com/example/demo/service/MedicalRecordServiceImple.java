package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MedicalRecordDto;
import com.example.demo.model.MedicalRecord;
import com.example.demo.repository.MedicalRecordRepository;

@Service
public class MedicalRecordServiceImple implements MedicalRecordService {

	@Autowired
	private MedicalRecordRepository medicalRecordRepository;

	@Override
	public MedicalRecord createMedicalRecord(MedicalRecordDto medicalRecord) {
		
		try {
			MedicalRecord medical=new MedicalRecord();
			medical.setDiagnosis(medicalRecord.getDiagnosis());
			medical.setDoctorId(medicalRecord.getDoctorId());
			medical.setId(medicalRecord.getId());
			medical.setPassword(medicalRecord.getPassword());
			medical.setPrescription(medical.getPrescription());
			medical.setTreatment(medical.getTreatment());
			medical.setVisitDate(medical.getVisitDate());

			return medicalRecordRepository.save(medical);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<MedicalRecord> getMedicalRecord() {
		// TODO Auto-generated method stub
		return medicalRecordRepository.findAll();
	}

	

	@Override
	public boolean deleteMedicalRecord(long id) {

		try {
			medicalRecordRepository.deleteById(id);
			return true;
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public MedicalRecord signin(MedicalRecordDto medicalRecord) throws Exception {
		try {
			return medicalRecordRepository.findByPatientIdAndPassword(medicalRecord.getPatientId(),
					medicalRecord.getPassword());
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			throw new Exception("Patient not found");
		}

	}

}
