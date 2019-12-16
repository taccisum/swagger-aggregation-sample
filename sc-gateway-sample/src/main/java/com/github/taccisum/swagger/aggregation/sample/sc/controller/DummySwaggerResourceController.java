package com.github.taccisum.swagger.aggregation.sample.sc.controller;

import com.github.taccisum.swagger.aggregation.support.sc.gateway.SwaggerResourceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-14
 */
@RestController
public class DummySwaggerResourceController extends SwaggerResourceController {
    @Autowired
    public DummySwaggerResourceController(SwaggerResourcesProvider swaggerResources) {
        super(swaggerResources);
    }
}
