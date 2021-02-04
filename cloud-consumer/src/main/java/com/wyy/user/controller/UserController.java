package com.wyy.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@Autowired
	DiscoveryClient discoveryClient;
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("hello")
	public String hello() {
		
		 List<ServiceInstance> list = discoveryClient.getInstances("alibaba-provider");
		 String targetUrl = list.stream().map(si -> si.getUri() + "/hello").findFirst().get();
		 String result = restTemplate.getForObject(targetUrl, String.class);
		return result;
	};
}
