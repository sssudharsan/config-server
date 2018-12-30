package com.sudharsan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sudharsan.domain.Doctor;


public interface DoctorService {
	
	Doctor addDoctor(Doctor doctor);
	
	List<Doctor> getAllDoctor();
	
	Doctor getDoctor(int id);

}
