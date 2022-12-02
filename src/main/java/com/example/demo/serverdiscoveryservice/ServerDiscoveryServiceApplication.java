package com.example.demo.serverdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerDiscoveryServiceApplication.class, args);
    }

}
