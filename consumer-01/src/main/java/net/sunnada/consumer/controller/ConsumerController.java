package net.sunnada.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("helloService")
    public String helloService(){
        String forObject = restTemplate.getForObject("http://localhost/hello", String.class);
        return forObject;
    }
}
