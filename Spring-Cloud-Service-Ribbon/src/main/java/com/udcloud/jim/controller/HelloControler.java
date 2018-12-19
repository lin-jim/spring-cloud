package com.udcloud.jim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udcloud.jim.service.HelloService;

@RestController
public class HelloControler {

	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi() {
		return helloService.hiService();
	}

}
