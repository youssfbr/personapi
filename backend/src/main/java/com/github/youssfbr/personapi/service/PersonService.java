package com.github.youssfbr.personapi.service;

import com.github.youssfbr.personapi.dto.MessageResponseDTO;
import com.github.youssfbr.personapi.entity.Person;
import com.github.youssfbr.personapi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@Service
public class PersonService {

    private PersonRepository personRepository;

    public MessageResponseDTO createPerson(Person person) {
        person = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + person.getId())
                .build();
    }
}
