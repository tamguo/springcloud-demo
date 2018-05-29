package com.reaps.admin.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reaps.admin.client.fallback.factory.ClothesSystemFallbackFactory;

@FeignClient(name = "clothes-system-service", fallbackFactory = ClothesSystemFallbackFactory.class)
public interface ClothesSystemClient {

    @RequestMapping(path = "/hello")
    String helloWorld();
    
    @RequestMapping(path = "/findAll")
    String findAll();
    
}
