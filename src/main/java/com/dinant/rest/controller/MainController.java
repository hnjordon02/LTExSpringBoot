package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MainController {
	
	@GetMapping("")
	public String home() {
		return "admin/index";
	}
	
	@GetMapping("/dev")
	public String devExtreme() {
		return "admin/devExtreme";
	}
	
	@GetMapping("/grid")
	public String gridExtreme() {
		return "admin/datagrid";
	}
}
