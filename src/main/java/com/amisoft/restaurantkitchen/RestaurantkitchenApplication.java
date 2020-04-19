package com.amisoft.restaurantkitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantkitchenApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantkitchenApplication.class, args);

    }

}
