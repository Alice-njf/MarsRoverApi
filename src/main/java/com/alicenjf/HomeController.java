package com.alicenjf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		model.put("name", "Alice");
		model.put("address", "1234 FakeAddrees st.");
		return "index";
	}
	
	@GetMapping("/test")
	public String getTest(ModelMap model) {
		model.put("name", "Test");
		model.put("address", "Test Adrress");
		return "index";
	}
}
