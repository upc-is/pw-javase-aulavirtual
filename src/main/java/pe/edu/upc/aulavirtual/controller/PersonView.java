package pe.edu.upc.aulavirtual.controller;

import pe.edu.upc.aulavirtual.business.crud.PersonService;
import pe.edu.upc.aulavirtual.model.entity.Person;

public class PersonView {
	
	// Declarar los valores a devolver
	private Person person;
	
	// Declarar el Service a utilizar
	private PersonService personService;
	
	// Dependency Injection
	public PersonView(PersonService personService) {
		this.personService = personService;
	}

	public Person getPerson() {
		person = personService.findById(10);
		return person;
	}

	
	
	
}
