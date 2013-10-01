package gr.ekt.cerif.services.link.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gr.ekt.cerif.entities.link.person.Person_Service;

@Component
public class LinkPersonServiceRepositoryImpl implements LinkPersonServiceRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkPersonServiceRepositoryImpl.class);
	
	@Autowired
	private LinkPersonServiceCrudRepository linkPersonServiceCrudRepository;

	@Override
	public void delete(Person_Service entity) {
		linkPersonServiceCrudRepository.delete(entity);		
	}

	@Override
	public void delete(Iterable<Person_Service> entities) {
		linkPersonServiceCrudRepository.save(entities);		
	}

	@Override
	public Iterable<Person_Service> save(Iterable<Person_Service> entities) {
		return linkPersonServiceCrudRepository.save(entities);
	}

	@Override
	public Person_Service save(Person_Service entity) {
		return linkPersonServiceCrudRepository.save(entity);
	}

}
