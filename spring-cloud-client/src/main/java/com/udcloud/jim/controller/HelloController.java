package com.udcloud.jim.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/hello")
	public String createClient(){
		return "this is spring cloud client,port is "+port;
		
	}
	
}