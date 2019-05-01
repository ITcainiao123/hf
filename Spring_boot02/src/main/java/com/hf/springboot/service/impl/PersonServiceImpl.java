package com.hf.springboot.service.impl;

import com.hf.springboot.mapper.PersonMapper;
import com.hf.springboot.pojo.Person;
import com.hf.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }
}
