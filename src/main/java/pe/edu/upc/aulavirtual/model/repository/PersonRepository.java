package pe.edu.upc.aulavirtual.model.repository;

import pe.edu.upc.aulavirtual.model.entity.Person;

// Para declarar los m�todos
public interface PersonRepository {
	
	Person findById(int id); 
}
