package gr.ekt.cerif.services.link.classscheme;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gr.ekt.cerif.entities.base.OrganisationUnit;
import gr.ekt.cerif.entities.link.ClassScheme_OrganisationUnit;
import gr.ekt.cerif.features.semantics.ClassScheme;

@Component
public class LinkClassSchemeOrganisationUnitRepositoryImpl implements LinkClassSchemeOrganisationUnitRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkClassSchemeOrganisationUnitRepositoryImpl.class);
	
	@Autowired
	private LinkClassSchemeOrganisationUnitCrudRepository linkClassSchemeOrganisationUnitCrudRepository;

	@Override
	public void delete(ClassScheme_OrganisationUnit entity) {
		linkClassSchemeOrganisationUnitCrudRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<ClassScheme_OrganisationUnit> entities) {
		linkClassSchemeOrganisationUnitCrudRepository.delete(entities);
	}

	@Override
	public Iterable<ClassScheme_OrganisationUnit> save(
			Iterable<ClassScheme_OrganisationUnit> entities) {
		return linkClassSchemeOrganisationUnitCrudRepository.save(entities);
	}

	@Override
	public ClassScheme_OrganisationUnit save(ClassScheme_OrganisationUnit entity) {
		return linkClassSchemeOrganisationUnitCrudRepository.save(entity);
	}

	@Override
	public List<ClassScheme_OrganisationUnit> findByScheme(
			ClassScheme classScheme) {
		return linkClassSchemeOrganisationUnitCrudRepository.findByScheme(classScheme);
	}

	@Override
	public List<ClassScheme_OrganisationUnit> findByOrganisationUnit(
			OrganisationUnit organisationUnit) {
		return linkClassSchemeOrganisationUnitCrudRepository.findByOrganisationUnit(organisationUnit);
	}

}
