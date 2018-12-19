package com.udcloud.jim.service.impl;

import org.springframework.stereotype.Component;

import com.udcloud.jim.service.FeignService;

@Component
public class FeignServiceImpl implements FeignService{

	@Override
	public String sayHiFromClientOne() {
		return "server error,sorry!";
	}

}
