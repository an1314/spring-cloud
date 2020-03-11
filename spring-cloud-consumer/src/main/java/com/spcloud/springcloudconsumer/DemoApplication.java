package com.spcloud.springcloudconsumer;

import com.spcloud.test.service.FeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.spcloud"})
@EnableFeignClients(basePackages = "com.spcloud.test.service") 
@RestController
@EnableHystrixDashboard
public class DemoApplication {

	@Autowired
	private FeignService feignService;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return feignService.sayHello("feign");
	}

}
