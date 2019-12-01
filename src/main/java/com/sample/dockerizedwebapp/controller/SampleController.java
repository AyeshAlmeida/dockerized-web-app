package com.sample.dockerizedwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public Map<String, Object> notifySubscription() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SUCCESS");
        response.put("description", "All works fine");
        return response;
    }
}
