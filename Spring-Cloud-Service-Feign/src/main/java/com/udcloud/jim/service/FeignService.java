package com.udcloud.jim.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udcloud.jim.service.impl.FeignServiceImpl;

/**
 * @FeignClient 的value表示调用spring-cloud-client
 * @RequestMapping(value = "/hello",method = RequestMethod.GET)表示调用
 * spring-cloud-client的"/hello"接口
 * fallback: 定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，
 * fallback指定的类必须实现@FeignClient标记的接口
 * @author Administrator
 *
 */
@FeignClient(value="spring-cloud-client",fallback=FeignServiceImpl.class)
public interface FeignService {
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
