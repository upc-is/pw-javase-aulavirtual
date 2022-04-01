package pe.edu.upc.aulavirtual.business.crud.impl;

import pe.edu.upc.aulavirtual.business.crud.PersonService;
import pe.edu.upc.aulavirtual.model.entity.Person;
import pe.edu.upc.aulavirtual.model.repository.PersonRepository;

public class PersonServiceImpl implements PersonService {
	
	private PersonRepository personRepository;

	// Dependency Injection		@Inject		@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person findById(int id) {
		Person person = personRepository.findById(id);
		return person;
	}

}
