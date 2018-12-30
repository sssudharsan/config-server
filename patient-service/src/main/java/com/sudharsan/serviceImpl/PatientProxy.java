package com.sudharsan.serviceImpl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PatientProxy {
	
	static RestTemplate rt = new RestTemplate();
	
	public static final String URL="http://localhost:8080/doctor/getDoctor/";
	
	public static String getDoctorDetails(int id) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		String docInfo = URL+id;
		return rt.getForObject(docInfo, String.class);
	}
	
	public static void main(String[] args) {
		System.out.println(getDoctorDetails(15));
	}

}
