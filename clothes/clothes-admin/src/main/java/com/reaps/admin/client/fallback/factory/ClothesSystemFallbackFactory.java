package com.reaps.admin.client.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import com.reaps.admin.client.ClothesSystemClient;


@Component
public class ClothesSystemFallbackFactory implements FallbackFactory<ClothesSystemClient> {

    @Override
    public ClothesSystemClient create(final Throwable cause) {
        System.out.println("create:" + cause);
        return new ClothesSystemClient() {
            @Override
            public String helloWorld() {
                return "error";
            }
            
            @Override
            public String findAll() {
                return "error";
            }
        };
    }
}
