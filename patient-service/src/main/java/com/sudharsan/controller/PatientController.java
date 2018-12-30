package com.sudharsan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudharsan.domain.Patient;
import com.sudharsan.service.PatientService;
import com.sudharsan.serviceImpl.PatientProxyInterface;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	private PatientProxyInterface pateintproxy;
	
	@PostMapping(path="/addPatient",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addPatient(@RequestBody Patient patient){
		patient = patientService.addPatient(patient);
		return new ResponseEntity<String>("Patient created successfully",HttpStatus.OK);
	}
	
	@PostMapping(path="/addDoctor",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addDoctor(@RequestBody String patient){
		ResponseEntity<String> bodyData = pateintproxy.addPatient(patient);
		return new ResponseEntity<String>(bodyData.toString(),HttpStatus.OK);
	}

}
