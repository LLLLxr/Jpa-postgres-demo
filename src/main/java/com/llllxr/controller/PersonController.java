package com.llllxr.controller;

import com.llllxr.entity.Person;
import com.llllxr.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService todoService;


    @GetMapping
    public List<Person> findAll() {
        return todoService.findAll();
    }
}
