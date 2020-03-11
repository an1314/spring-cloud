package com.spcloud.test.service.impl;

import com.spcloud.test.service.FeignService;

import org.springframework.stereotype.Component;

/**
 * FeignServiceImpl
 */
@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String sayHello(String name) {
        return "error feign";
    }
}