package com.sudharsan.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudharsan.domain.Doctor;
import com.sudharsan.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping(path="/createDoctor", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addDoctor(@RequestBody Doctor doctor) {
		doctor = doctorService.addDoctor(doctor);
		return new ResponseEntity<>(String.format("Doctor Created Successfully"),HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctorList = doctorService.getAllDoctor();
		return new ResponseEntity<List<Doctor>>(doctorList,HttpStatus.OK);
	}
	
	@GetMapping(path="/getDoctor/{id}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable("id") int id){
		Doctor getDoctor = doctorService.getDoctor(id);
		if(getDoctor != null)
		return new  ResponseEntity<Doctor>(getDoctor,HttpStatus.OK);
		else
		return new  ResponseEntity<Doctor>(HttpStatus.NO_CONTENT);
	}
	

}
