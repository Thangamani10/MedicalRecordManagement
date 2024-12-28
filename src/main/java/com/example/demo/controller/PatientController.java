package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PatientDto;
import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;
@RestController
public class PatientController {

	@Autowired
	
	private PatientService patientService;
	
	
	@PostMapping("/save/patient")
	
	public Map<String,Object>createPatient (@RequestBody Patient patient){
		Patient patients=patientService.createPatient(patient);
		Map<String ,Object>response=new HashMap<>();
		if(patient!=null) {
			response.put("Message", "Success");
			response.put("status", HttpStatus.OK);
		}else {
			response.put("Message", "Failed");
			response.put("Ststus",HttpStatus.BAD_REQUEST);
		}response.put("timestamp",new Date());
		return response;
	}
	
	@GetMapping("/get/patient")
	
	public List<Patient>getPatientAndGender(@RequestParam("name")String patientName,@RequestParam("gender")String gender){
		return patientService.getPatientByNameAndGender(patientName, gender);
	}
	
	@PostMapping("/login/Patient")
  
	public Map<String,Object> login(@RequestBody PatientDto patients)throws Exception{
		Patient patient=patientService.sigin(patients);
		Map<String,Object>response=new HashMap<>();
		if(patient!=null) {
			response.put("Message","Login Successfull");
			response.put("Status", HttpStatus.OK);
		}else {
			response.put("Message", "Login Failed");
			response.put("Status", HttpStatus.BAD_REQUEST);
		}response.put("timeStamp", new Date());
		
		return response;
	}
	
	@DeleteMapping("Delete/Patient")
	
	public Map<String,Object> deletePatient(@RequestBody long id){
		Map<String,Object>response=new HashMap<>();
		boolean deletePatient=patientService.deletePatient(id);
		
		if(deletePatient==true) {
			patientService.deletePatient(id);
			response.put("Message", "Deleted Successfully");
			response.put("Status", HttpStatus.OK);
			
		}else {
			response.put("Message", "Failed");
			response.put("Status", HttpStatus.BAD_REQUEST);
		}response.put("timeStamp", new Date());
		return response;
	}
	
	
}
