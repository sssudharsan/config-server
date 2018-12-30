package com.sudharsan.patientDao;

import com.sudharsan.domain.Patient;

public interface PatientDao {
	
	Patient addPatient(Patient patient);
	
	void getAllPatient();

}
