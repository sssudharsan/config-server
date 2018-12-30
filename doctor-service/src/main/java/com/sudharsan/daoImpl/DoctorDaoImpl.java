package com.sudharsan.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudharsan.dao.DoctorDao;
import com.sudharsan.domain.Doctor;

@Repository
public class DoctorDaoImpl implements DoctorDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(doctor);
		return doctor;
	}

	@Override
	@Transactional
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return (List<Doctor>) sessionFactory.getCurrentSession().createCriteria(Doctor.class).list();
	}

	@Override
	@Transactional
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return (Doctor) sessionFactory.getCurrentSession().get(Doctor.class, id);
	}

}
