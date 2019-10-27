package com.liutopeda.travel.person.http;

import com.liutopeda.travel.person.entity.Person;
import com.liutopeda.travel.person.jpa.PersonRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public List<Person> getHotels() {
        final List<Person> persons = this.personRepository.findAll();
        return persons;
    }
}
