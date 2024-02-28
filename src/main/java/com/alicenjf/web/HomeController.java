package com.alicenjf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.alicenjf.response.MarsRoverApiResponse;
import com.alicenjf.service.MarsRoverApiService;

@Controller
public class HomeController {
	@Autowired
	private MarsRoverApiService roverService;
	
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		//MarsRoverApiService roverData = new MarsRoverApiService();
		MarsRoverApiResponse roverData = roverService.getRoverData();
		model.put("roverData", roverData);
		return "index";
	}
	
	@GetMapping("/test")
	public String getTest(ModelMap model) {
		model.put("name", "Test");
		model.put("address", "Test Adrress");
		return "index";
	}
}
