package com.github.taccisum.swagger.aggregation.sample.app;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-12-16
 */
@RestController
@RequestMapping("foo")
public class FooController {
    @GetMapping
    @ApiOperation("foo service index")
    public String index() {
        return "foo service index";
    }
}
