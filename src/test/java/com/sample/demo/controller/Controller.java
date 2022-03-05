package com.sample.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.demo.service.CalculateService;

class Controller {
	@Autowired
	CalculateService service;

	@Test
	void test() {
		int[] x = { 1, 2, 3, 2, 4, 1 };
		int result = service.avg(x);
		org.springframework.util.Assert.isTrue(result == 1);
	}

}
