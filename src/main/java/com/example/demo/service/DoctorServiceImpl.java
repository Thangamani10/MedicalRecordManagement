package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorReposiotry;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorReposiotry doctorReposiotry;

	@Override
	public Doctor createDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorReposiotry.save(doctor);
	}

	@Override
	public List<Doctor> getDoctorByNameAndSpeciallization(String doctorName, String speciallization) {
		// TODO Auto-generated method stub
		return doctorReposiotry.findByDoctorNameAndSpeciallization(doctorName, speciallization);
	}

	@Override
	public Doctor sigin(DoctorDto doctor) throws Exception {

		try {
			return doctorReposiotry.findByDoctorNameAndPassword(doctor.getDoctorName(), doctor.getPassword());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		throw new Exception("Invalid Doctor");
	}

	@Override
	public boolean deleteDoctor(long id) {

		try {
			doctorReposiotry.deleteById(id);
			return true;
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}

}
