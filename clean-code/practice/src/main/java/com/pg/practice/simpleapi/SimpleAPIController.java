package com.pg.practice.simpleapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAPIController {
    @RequestMapping("/simpleapi")
    public String simpleApi() {
        String resp = "This is a simple test API response";
        return resp;

    }
}
