package pe.edu.upc.aulavirtual;

import pe.edu.upc.aulavirtual.business.crud.PersonService;
import pe.edu.upc.aulavirtual.business.crud.impl.PersonServiceImpl;
import pe.edu.upc.aulavirtual.controller.PersonView;
import pe.edu.upc.aulavirtual.model.entity.Person;
import pe.edu.upc.aulavirtual.model.repository.PersonRepository;
import pe.edu.upc.aulavirtual.model.repository.impl.PersonRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Developers");

		// Instanciación de los objetos 
		PersonRepository personRepository = new PersonRepositoryImpl();
		PersonService personService = new PersonServiceImpl(personRepository);
		PersonView personView = new PersonView(personService);		
		
		Person person = personView.getPerson();
		
		System.out.println(person.getId());
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
	}

}
