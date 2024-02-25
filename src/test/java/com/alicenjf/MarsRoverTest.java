package com.alicenjf;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverTest {
	@Test
	public void maarsTest() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", String.class);
		System.out.println(response.getBody());
	}
}
