package com.udcloud.jim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableHystrix
@EnableHystrixDashboard//开启hystrix仪表盘
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRibbonApplication.class, args);
	}

	/**
	 * @ LoadBalanced注册表明，这个restRemplate是负载均衡的
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

