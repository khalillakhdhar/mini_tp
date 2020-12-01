package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	@GetMapping("/api")
	public String getFoos(@RequestParam(required = false) String id) {
	return "ID: " + id;
	}
	@GetMapping("/api2")
	@ResponseBody
	public String getting(@RequestParam(defaultValue = "test") String id) {
	return "ID: " + id;
	}
	@GetMapping("page")
	public ModelAndView pageweb()
	{
		ModelAndView mapage=new ModelAndView("newsletter.html");
		return mapage;
		
		
	}
	@PostMapping("news")
	@ResponseBody
	public String news(@RequestParam String letter)
	{
		return letter+" inscrit avec succés";
		
		
	}
}
