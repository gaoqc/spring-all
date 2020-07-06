package com.sc.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-provider")
@RequestMapping("/v1/user/info")
public interface UserService {
    @GetMapping("/name/{id}")
    String   getName(@PathVariable("id") String id);
    @PostMapping("/name/{id}")
    String  setName(@PathVariable("id")String id, @RequestParam("name")String name);

}
