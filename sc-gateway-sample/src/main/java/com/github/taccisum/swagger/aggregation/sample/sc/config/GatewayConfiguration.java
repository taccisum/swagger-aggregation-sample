package com.github.taccisum.swagger.aggregation.sample.sc.config;

import com.github.taccisum.swagger.aggregation.support.sc.gateway.DiscoverySwaggerResourceProvider;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-16
 */
@Configuration
public class GatewayConfiguration {
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider(RouteDefinitionLocator definitionLocator) {
        return new DiscoverySwaggerResourceProvider(definitionLocator);
    }
}
