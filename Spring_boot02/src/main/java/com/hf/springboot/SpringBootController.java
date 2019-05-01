package com.hf.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("springboot")
public class SpringBootController {
    @RequestMapping("test")
    public String springBootTest(){
        return "spring boot";
    }
}
