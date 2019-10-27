package com.liutopeda.travel.person.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.liutopeda.travel.person.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
