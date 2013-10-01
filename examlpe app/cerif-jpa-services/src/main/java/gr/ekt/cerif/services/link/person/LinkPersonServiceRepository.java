package gr.ekt.cerif.services.link.person;

import gr.ekt.cerif.entities.link.person.Person_Service;

/**
 * A repository for links between persons and services.
 * 
 */
public interface LinkPersonServiceRepository {

	public void delete(Person_Service entity); 
	
	public void delete(Iterable<Person_Service> entities); 

	public Iterable<Person_Service> save(Iterable<Person_Service> entities); 
	
	public Person_Service save(Person_Service entity);
	
}
