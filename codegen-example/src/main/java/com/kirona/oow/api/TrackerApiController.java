package com.kirona.oow.api;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")
@RestController
public class TrackerApiController implements TrackerApi {

    private final TrackerApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public TrackerApiController(TrackerApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public TrackerApiDelegate getDelegate() {
        return delegate;
    }
}
