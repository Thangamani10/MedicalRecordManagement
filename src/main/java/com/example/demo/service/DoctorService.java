package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.PatientDto;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@Service
public interface DoctorService {

	 Doctor createDoctor(Doctor doctor);
	
	 List<Doctor> getDoctorByNameAndSpeciallization(String doctorName,String speciallization);
    
     Doctor sigin(DoctorDto doctor)throws Exception;
	
	 boolean deleteDoctor(long id);


}
