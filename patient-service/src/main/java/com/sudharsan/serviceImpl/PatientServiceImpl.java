package com.sudharsan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudharsan.domain.Patient;
import com.sudharsan.patientDao.PatientDao;
import com.sudharsan.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDao patientDao;

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		String docInfo = PatientProxy.getDoctorDetails(Integer.parseInt(patient.getDoctorInfo()));
		patient.setDoctorInfo(docInfo);
		System.out.println(patient.getDoctorInfo());
		System.out.println(patient.getEmail());
		return patientDao.addPatient(patient);
	}

	@Override
	public void getAllPatient() {
		// TODO Auto-generated method stub

	}

}
