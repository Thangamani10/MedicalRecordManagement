package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@Repository
public interface DoctorReposiotry extends JpaRepository<Doctor, Long> {

//	List<Doctor> findById(long id);

	List<Doctor> findByDoctorNameAndSpeciallization(String doctorName, String speciallization);

	Doctor findByDoctorNameAndPassword(String doctorName, String password);

}
