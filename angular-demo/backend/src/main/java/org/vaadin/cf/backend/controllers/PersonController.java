package org.vaadin.cf.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vaadin.cf.backend.data.Person;
import org.vaadin.cf.backend.repositories.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/findAll")	
	public List<Person> getPersons() {
		return personRepository.findAll();
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public Person addPerson(@RequestBody Person person) {
		personRepository.saveAndFlush(person);
		return person;
	}

}
