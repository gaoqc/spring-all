package com.sc.consumer.web.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private LoadBalancerClient lb;




    @GetMapping("/v1/con/user/{id}")
    public Object get(@PathVariable("id")String id){
//        final Map<String,String> map= Maps.newHashMap();
//        client.getServices().forEach(
//                serviceName->{
//                    client.getInstances(serviceName).forEach(inst->{
//                        map.put(serviceName, JSONObject.toJSONString(inst));
//                    });
//                }
//        );
         ServiceInstance  instance=lb.choose("user-provider");
         return  new RestTemplate().getForObject(instance.getUri()+"/v1/user/"+id,String.class);
//        return  map;

//        return template.getForObject("http://localhost:8088/v1/user/"+id,String.class);
    }

}
