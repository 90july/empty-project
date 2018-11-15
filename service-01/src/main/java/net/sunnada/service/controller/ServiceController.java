package net.sunnada.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {


    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
