package com.github.taccisum.swagger.aggregation.sample.sc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-16
 */
@Configuration
public class SwaggerConfiguration {
    @Bean
    public SwaggerResourcesProvider customSwaggerResourcesProvider() {
        return () -> {
            ArrayList<SwaggerResource> ls = new ArrayList<>();
            SwaggerResource r = new SwaggerResource();
            r.setName("custom-service");
            r.setLocation("/custom_location");
            r.setSwaggerVersion("2.0");
            ls.add(r);
            return ls;
        };
    }
}
