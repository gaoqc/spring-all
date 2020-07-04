package com.sc.consumer.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @GetMapping("/v1/con/user/{id}")
    public Object get(@PathVariable("id")String id){
        
        return new RestTemplate().getForObject("http://localhost:8088/v1/user/"+id,String.class);
    }

}
