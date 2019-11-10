package com.mytest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return restTemplate.getForObject("http://provider-demo/echo/"+string,String.class);
    }

}



