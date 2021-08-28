package com.github.youssfbr.personapi.controller;

import com.github.youssfbr.personapi.dto.MessageResponseDTO;
import com.github.youssfbr.personapi.entity.Person;
import com.github.youssfbr.personapi.repository.PersonRepository;
import com.github.youssfbr.personapi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
