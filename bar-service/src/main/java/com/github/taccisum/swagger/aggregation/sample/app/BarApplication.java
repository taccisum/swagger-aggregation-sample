package com.github.taccisum.swagger.aggregation.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BarApplication {
    public static void main(String[] args) {
        SpringApplication.run(BarApplication.class, args);
    }
}
