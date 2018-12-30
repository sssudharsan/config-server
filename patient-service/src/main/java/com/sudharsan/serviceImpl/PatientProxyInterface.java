package com.sudharsan.serviceImpl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sudharsan.domain.Patient;

@FeignClient(name="patient-proxy",url="http://localhost:8080/doctor")
public interface PatientProxyInterface {
	
	@PostMapping(path="/addPatient",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addPatient(@RequestBody String patient);
		

	
	

}
