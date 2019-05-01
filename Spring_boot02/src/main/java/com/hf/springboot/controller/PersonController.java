package com.hf.springboot.controller;

import com.hf.springboot.pojo.Person;
import com.hf.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("oracle")
public class PersonController {
    @Autowired
    private PersonService personService;
    //查询person所有数据
    @RequestMapping("findAll")
    public List<Person> findAll(){

        return personService.findAll();
    }
}
