package gr.ekt.cerif.services.link.postaladdress;

import gr.ekt.cerif.entities.link.PostalAddress_GeographicBoundingBox;
import gr.ekt.cerif.entities.second.GeographicBoundingBox;
import gr.ekt.cerif.entities.second.PostalAddress;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

public interface LinkPostalAddressGeographicBoundingBoxCrudRepository extends CrudRepository<PostalAddress_GeographicBoundingBox, Long> {
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<PostalAddress_GeographicBoundingBox> findByPostalAddress(PostalAddress postalAddress);
	
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<PostalAddress_GeographicBoundingBox> findByGeographicBoundingBox(GeographicBoundingBox geographicBoundingBox);

}
