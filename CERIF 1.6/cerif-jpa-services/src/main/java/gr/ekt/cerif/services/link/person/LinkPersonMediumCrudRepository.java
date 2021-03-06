package gr.ekt.cerif.services.link.person;

import java.util.List;

import javax.persistence.QueryHint;

import gr.ekt.cerif.entities.base.Person;
import gr.ekt.cerif.entities.link.person.Person_Medium;
import gr.ekt.cerif.entities.second.Medium;

import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

public interface LinkPersonMediumCrudRepository extends CrudRepository<Person_Medium, Long> {
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<Person_Medium> findByPerson(Person person);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<Person_Medium> findByMedium(Medium medium);

}
