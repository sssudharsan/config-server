package com.sudharsan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudharsan.domain.Patient;
import com.sudharsan.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping(path="/addPatient")
	public ResponseEntity<?> addPatient(@RequestBody Patient patient){
		patient = patientService.addPatient(patient);
		return new ResponseEntity<>(String.format("Patient Created Successfully"),HttpStatus.CREATED);
	}

}
