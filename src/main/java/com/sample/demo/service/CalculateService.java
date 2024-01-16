package com.sample.demo.service;

import org.springframework.stereotype.Service;

import static java.lang.System.*;

@Service
public class CalculateService {

	public int avg(int[] args) {
		err.println(args.length);
		int total = 0;
		for (int i : args) {
			total += args[i - 1];
		}
		err.println(total);
		return total / args.length;
	}
}
