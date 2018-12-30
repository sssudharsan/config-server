package com.sudharsan.patientDaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudharsan.domain.Patient;
import com.sudharsan.patientDao.PatientDao;


@Repository
public class PatientDaoImpl implements PatientDao {
	
	@Autowired
	SessionFactory sf;

	@Override
	@Transactional
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(patient);
		return patient;
	}

	@Override
	public void getAllPatient() {
		// TODO Auto-generated method stub

	}

}
