package com.alicenjf.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alicenjf.dto.HomeDto;
import com.alicenjf.response.MarsPhoto;
import com.alicenjf.response.MarsRoverApiResponse;
@Service
public class MarsRoverApiService {
	
	private static final String API_KEY = "XwxaIQ3keTPNpWHwMWAcQ2eA6zOQEAd8WyUC2hvN";
	
	public MarsRoverApiResponse getRoverData(HomeDto homeDto) {
		RestTemplate rt = new RestTemplate();
		List<String> apiUrlEndpoints = getApiUrlEndpoints(homeDto);
		List<MarsPhoto> photos = new ArrayList<>();
		MarsRoverApiResponse response = new MarsRoverApiResponse();
		
		apiUrlEndpoints.stream().
			forEach(url -> {
				MarsRoverApiResponse apiResponse = rt.getForObject(url, MarsRoverApiResponse.class);
				photos.addAll(apiResponse.getPhotos());
				}
			);
		response.setPhotos(photos);
		//ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol=" + homeDto.getMarsSol() + "&api_key=" + API_KEY, MarsRoverApiResponse.class);
		return response;
	}
	public List<String> getApiUrlEndpoints (HomeDto homeDto){
		List<String> urls = new ArrayList<>();
		if (Boolean.TRUE.equals(homeDto.getCameraFhaz())) {
			urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol=" + homeDto.getMarsSol() + "&api_key=" + API_KEY +"&camera=FHAZ");
		}
		
		return urls;
	}
	

}
