package com.thanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String get() {
		return "index";
	}
	@RequestMapping("/json_demo")
	public String getjson() {
		return "get_json";
	}
	@RequestMapping("/array_data")
	public String getarray_data() {
		return "array_data";
	}
	@RequestMapping("/grid_data")
	public String grid_data() {
		return "grid_data";
	}
}
