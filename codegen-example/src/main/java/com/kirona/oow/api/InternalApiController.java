package com.kirona.oow.api;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")
@RestController
public class InternalApiController implements InternalApi {

    private final InternalApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public InternalApiController(InternalApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public InternalApiDelegate getDelegate() {
        return delegate;
    }
}
