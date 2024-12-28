package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.MedicalRecordDto;
import com.example.demo.model.MedicalRecord;

@Service
public interface MedicalRecordService {

   public MedicalRecord createMedicalRecord(MedicalRecordDto medicalRecord);
	
	 List<MedicalRecord>getMedicalRecord();
	
    MedicalRecord signin(MedicalRecordDto medicalRecord) throws Exception;
	
	 boolean deleteMedicalRecord(long id);


}
