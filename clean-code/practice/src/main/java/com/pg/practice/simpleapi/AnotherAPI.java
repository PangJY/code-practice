package com.pg.practice.simpleapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherAPI {
    @RequestMapping("/anotherapi")
    public String simpleApi() {
        // HttpEntity
        String resp = "This is a simple test API response";
        return resp;
    }
}
