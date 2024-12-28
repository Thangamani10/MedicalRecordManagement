package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MedicalRecordDto;
import com.example.demo.dto.PatientDto;
import com.example.demo.model.MedicalRecord;
import com.example.demo.model.Patient;
import com.example.demo.service.MedicalRecordService;

@RestController
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordService;

	@PostMapping("/save/Medical Record")
	public ResponseEntity< Map<String, Object>> createMedicalRecord(@RequestBody MedicalRecordDto medicalRecord) {
		MedicalRecord medicalRecords = medicalRecordService.createMedicalRecord(medicalRecord);

		Map<String, Object> response = new HashMap<>();
		if (medicalRecords != null) {
			response.put("Message", "Successfully Created");
//			response.put("Status", HttpStatus.OK);
			response.put("timeStamp", new Date());
			return new ResponseEntity<>(response,HttpStatus.OK);
		} else {
			response.put("Message", "Failed");
			response.put("timeStamp", new Date());
//			response.put("Status", HttpStatus.BAD_REQUEST);
			return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
			}
//		response.put("timeStamp", new Date());
	}

	@GetMapping("/get/medicalRecord")

	public List<MedicalRecord> geMedicalRecords(@RequestParam("id") int id) {
		return medicalRecordService.getMedicalRecord();
	}

	@PostMapping("/login/MedicalRecord")

	public Map<String, Object> login(@RequestBody MedicalRecordDto medicalRecord) throws Exception {
		MedicalRecord medicalRecords = medicalRecordService.signin(medicalRecord);
		Map<String, Object> response = new HashMap<>();
		if (medicalRecords != null) {
			response.put("Message", "Login Successfull");
			response.put("Status", HttpStatus.OK);
		} else {
			response.put("Message", "Login Failed");
			response.put("Status", HttpStatus.BAD_REQUEST);
		}
		response.put("timeStamp", new Date());

		return response;
	}

	@DeleteMapping("/Delete/MedicalRecord")

	public Map<String, Object> deleteMedicalRecord(@RequestBody long id) {
		Map<String, Object> response = new HashMap<>();
		boolean deleteMedicalRecord = medicalRecordService.deleteMedicalRecord(id);

		if (deleteMedicalRecord == true) {
			medicalRecordService.deleteMedicalRecord(id);
			response.put("Message", "Successfull");
			response.put("Status", HttpStatus.OK);

		} else {
			response.put("Message", "Failed");
			response.put("Status", HttpStatus.BAD_REQUEST);

		}
		response.put("timeStamp", new Date());
		return response;
	}
}
