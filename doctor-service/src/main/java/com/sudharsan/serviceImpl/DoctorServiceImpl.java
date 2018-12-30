package com.sudharsan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudharsan.dao.DoctorDao;
import com.sudharsan.domain.Doctor;
import com.sudharsan.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDao doctorDao;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDao.addDoctor(doctor);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorDao.getAllDoctor();
	}

	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return doctorDao.getDoctor(id);
	}

}
