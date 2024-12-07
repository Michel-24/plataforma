package com.example.demo.Person;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepositary personRepo;

    public void createPersona(Person person)
    {
        personRepo.save(person);
    }

}
