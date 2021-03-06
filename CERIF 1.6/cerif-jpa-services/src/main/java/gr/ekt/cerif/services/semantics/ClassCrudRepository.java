package gr.ekt.cerif.services.semantics;

import gr.ekt.cerif.features.semantics.Class;
import gr.ekt.cerif.features.semantics.ClassScheme;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

public interface ClassCrudRepository extends CrudRepository<Class, Long> {

	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public Class findById(Long id);
    
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<Class> findByUri(String uri);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<Class> findByUuid(String uuid);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<Class> findByScheme(ClassScheme scheme);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<Class> findAll();
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public Page<Class> findAll(Pageable page);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<Class> findByUuidAndScheme(String uuid, ClassScheme scheme);
	
	@Query("select c from Class c join c.scheme s where c.uuid = ?1 and s.uuid = ?2 ")
	Class findByUuidAndSchemeUuid(String uuid, String schemeUuid);

}
