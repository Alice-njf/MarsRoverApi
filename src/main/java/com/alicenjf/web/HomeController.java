package com.alicenjf.web;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import com.alicenjf.dto.HomeDto;
import com.alicenjf.response.MarsRoverApiResponse;
import com.alicenjf.service.MarsRoverApiService;

@Controller
public class HomeController {
	@Autowired
	private MarsRoverApiService roverService;
	
	@GetMapping("/")
	public String getHomeView(ModelMap model, HomeDto homeDto) {
		// Testing before Auto wired : MarsRoverApiService roverData = new MarsRoverApiService();
		
		if (StringUtils.isEmpty(homeDto.getMarsApiRoverData()) ) {
			homeDto.setMarsApiRoverData("Opportunity");
		}
		
		if (homeDto.getMarsSol() == null) {
			homeDto.setMarsSol(1);
		}
		

		MarsRoverApiResponse roverData = roverService.getRoverData(homeDto.getMarsApiRoverData(), homeDto.getMarsSol());
		model.put("roverData", roverData);
		model.put("homeDto", homeDto);
		
		return "index";
	}
	
	@GetMapping("/test")
	public String getTest(ModelMap model) {
		model.put("name", "Test");
		model.put("address", "Test Adrress");
		
		return "index";
	}
	
	/* @PostMapping("/")
	public String postHomeView(ModelMap model, @RequestParam String marsApiRoverData) {
		MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
		model.put("roverData", roverData);
		return "index";
		
	}*/
}
