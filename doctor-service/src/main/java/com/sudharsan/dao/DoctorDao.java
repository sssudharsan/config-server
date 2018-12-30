package com.sudharsan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sudharsan.domain.Doctor;


public interface DoctorDao {
	
	Doctor addDoctor(Doctor doctor);
	
	List<Doctor> getAllDoctor();
	
	Doctor getDoctor(int id);

}
