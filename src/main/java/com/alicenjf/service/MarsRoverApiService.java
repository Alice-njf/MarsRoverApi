package com.alicenjf.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alicenjf.response.MarsRoverApiResponse;
@Service
public class MarsRoverApiService {
	
	public MarsRoverApiResponse getRoverData(String roverType) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=16&api_key=DEMO_KEY", MarsRoverApiResponse.class);
		return response.getBody();
	}
	

}