package org.vaadin.cf.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.cf.backend.data.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
