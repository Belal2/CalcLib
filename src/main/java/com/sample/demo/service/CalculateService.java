package com.sample.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

	public int avg(int[] args) {
		System.err.println(args.length);
		int total = 0;
		for (int i : args) {
			total += args[i - 1];
		}
		System.err.println(total);
		return total / args.length;
	}
}
