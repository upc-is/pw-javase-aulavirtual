package pe.edu.upc.aulavirtual.model.repository.impl;

import pe.edu.upc.aulavirtual.model.entity.Person;
import pe.edu.upc.aulavirtual.model.repository.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository  {

	@Override
	public Person findById(int id) {
		// Data en Crudo
		Person person = new Person();
		person.setId(id);
		person.setLastName("Chura");
		person.setFirstName("Ricardo");
		person.setAge(60);
		
		return person;
	}

}
