package com.sudharsan.serviceImpl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//@FeignClient(name="patient-proxy",url="http://localhost:8080/doctor")
@FeignClient(name="patient-service")
public interface PatientProxyInterface {
	
	@PostMapping(path="/doctor/createDoctor",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addPatient(@RequestBody String patient);
		

	
	

}
