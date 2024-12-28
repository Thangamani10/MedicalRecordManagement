package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DoctorDto;
import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/save/Doctor")
	
	public Map<String,Object> createDoctor(@RequestBody Doctor doctor){
		Doctor doctors=doctorService.createDoctor(doctor);
		Map<String,Object> response=new HashMap<>();
		
		if(doctors!=null) {
			response.put("Message", "Successfull");
			response.put("Status", HttpStatus.OK);
		}else {
			response.put("Message", "Failed");
			response.put("Status", HttpStatus.BAD_REQUEST);
		}response.put("timeStamp", new Date());
		
		return response;
	}
	
	@GetMapping("/get/Doctor")
	
	public List<Doctor> getDoctorsByNameAndSpeciallization(@RequestParam("name")String doctor,@RequestParam("speciallization")String speciallization){
		return doctorService.getDoctorByNameAndSpeciallization(doctor, speciallization);
	}

    @PostMapping("login.Doctor")
    
    public Map<String,Object> login(@RequestBody DoctorDto doctor)throws Exception{
    	
    	Doctor doctors=doctorService.sigin(doctor);
   	
    	Map<String,Object>response=new HashMap<>();
    	
    	if(doctors!=null) {
    		response.put("Message", "Login Successfull");
    		response.put("Status", HttpStatus.OK);
    	}else {
    		response.put("Message", "Login Failed");
    		response.put("Status", HttpStatus.BAD_REQUEST);
    	}response.put("timeStamp", new Date());
    	return response;
    }

  @DeleteMapping("/Delete/Doctor")

  public Map<String,Object> deleteDoctor(@RequestBody long id){
	  
	  Map<String,Object> response=new HashMap<>();
	  
	  boolean deleteDoctor=doctorService.deleteDoctor(id);
	  
	  if(deleteDoctor==true) {
		  doctorService.deleteDoctor(id);
		  response.put("Message", "Successfull");
		  response.put("Status", HttpStatus.OK);
	  }else {
		  response.put("Message", "Failed");
		  response.put("Status", HttpStatus.BAD_REQUEST);
	  }response.put("timeStamp", new Date());
	  return response ;
  }


}
