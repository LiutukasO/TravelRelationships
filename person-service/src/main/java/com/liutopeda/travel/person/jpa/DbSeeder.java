package com.liutopeda.travel.person.jpa;

import com.liutopeda.travel.person.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
    private PersonRepository personRepository;

    public DbSeeder(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Person ovidijus = new Person("Ovidijus");
        Person tomas = new Person("Tomas");
        Person povilas = new Person("Povilas");

        List<Person> persons = new ArrayList<>();
        persons.add(ovidijus);
        persons.add(tomas);
        persons.add(povilas);

        this.personRepository.saveAll(persons);
    }
}
