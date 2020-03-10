package com.spcloud.springcloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spcloud.Hello;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(value = "/hello/{name}")
	public String sayHello(@PathVariable(value = "name") String name){
		return new Hello().sayHello(name);
	}
}
