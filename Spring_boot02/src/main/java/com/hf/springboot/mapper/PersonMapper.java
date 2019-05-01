package com.hf.springboot.mapper;

import com.hf.springboot.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersonMapper {
    public List<Person> findAll();
}
