package gr.ekt.cerif.services.link.expertiseandskills;

import gr.ekt.cerif.entities.link.ExpertiseAndSkills_Class;
import gr.ekt.cerif.entities.second.ExpertiseAndSkills;
import gr.ekt.cerif.features.semantics.Class;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

public interface LinkExpertiseAndSkillsClassCrudRepository extends CrudRepository<ExpertiseAndSkills_Class, Long> {
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	@Query(value = "select exskcl "
			+ "  from ExpertiseAndSkills_Class exskcl         	"
			+ "  join exskcl.expertiseAndSkills exsk            	"
			+ "  where exsk = ?1 ")
	List<ExpertiseAndSkills_Class> findByExpertiseAndSkills(ExpertiseAndSkills expertiseAndSkills);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<ExpertiseAndSkills_Class> findBytheClass(Class theClass);

}
