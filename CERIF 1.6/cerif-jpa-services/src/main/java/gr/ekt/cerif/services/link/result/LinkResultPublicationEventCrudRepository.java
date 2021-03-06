package gr.ekt.cerif.services.link.result;

import java.util.List;

import javax.persistence.QueryHint;

import gr.ekt.cerif.entities.link.result.ResultPublication_Event;
import gr.ekt.cerif.entities.result.ResultPublication;
import gr.ekt.cerif.entities.second.Event;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

public interface LinkResultPublicationEventCrudRepository extends CrudRepository<ResultPublication_Event, Long> {
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<ResultPublication_Event> findByResultPublication(ResultPublication resultPublication);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<ResultPublication_Event> findByEvent(Event event);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	@Query(value = "select respubev" +
			   "  from ResultPublication respub  "+
			   "  left join respub.resultPublications_events respubev "+
			   "  where respub.id=?1")
	List<ResultPublication_Event> findResPublEventByResPublId(Long id);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	@Query(value = " select respubev from ResultPublication respub "+
			"  left join respub.resultPublications_events respubev " +
			"  left join respubev.theClass respubevcl " +
			"  where respub.id = ?1 and respubevcl.uri= ?2   ")
	List<ResultPublication_Event> findByResPublIdAndClassUri(Long respubId, String classUri);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	@Query(value = " select respubev from ResultPublication respub "+
			"  left join respub.resultPublications_events respubev " +
			"  left join respubev.event ev " +
			"  left join respubev.theClass respubevcl " +
			"  where respub.id = ?1 and respubevcl.uri= ?2 "+
			"  and ev.id= ?3   ")
	ResultPublication_Event findByResPublIdAndClassUriAndEventId(Long respubId, String classUri, Long eventId);

}
