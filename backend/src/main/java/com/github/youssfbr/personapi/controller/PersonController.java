package com.github.youssfbr.personapi.controller;

import com.github.youssfbr.personapi.dto.MessageResponseDTO;
import com.github.youssfbr.personapi.entity.Person;
import com.github.youssfbr.personapi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        person = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + person.getId())
                .build();
    }
}
