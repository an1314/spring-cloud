package com.spcloud.test.service;

import com.spcloud.test.service.impl.FeignServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feignService
 */
@FeignClient(name = "CLOUD-PROVIDER", fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping("/hello/{name}") //user/1
    String sayHello(@PathVariable("name") String name);

    
}