package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.service.CalculateService;

@RestController
public class Controller {
	@Autowired
	CalculateService service;

	@GetMapping("/avarage/{vals}")
	public int getAvg(@PathVariable(name = "vals") int[] vals) {
		System.err.println(vals.length);
		return service.avg(vals);
	}
}
