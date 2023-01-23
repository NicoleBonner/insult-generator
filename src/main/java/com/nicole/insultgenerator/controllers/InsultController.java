package com.nicole.insultgenerator.controllers;



import com.nicole.insultgenerator.models.Insult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nicole.insultgenerator.services.InsultService;

@RestController
public class InsultController {

    @Autowired
    InsultService service;

    @GetMapping (path = "/insult/name/{name}")
    public Insult getInsultForPerson(@PathVariable(name = "name") String name){
        return service.getInsultForPerson(name);

    }

}
