package com.github.taccisum.swagger.aggregation.sample.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ScGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScGatewayApplication.class, args);
    }
}
