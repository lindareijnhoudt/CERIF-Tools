package gr.ekt.cerif.services.multilingual.resultpublication;


import java.util.List;

import gr.ekt.cerif.entities.result.ResultPublication;
import gr.ekt.cerif.features.multilingual.ResultPublicationKeyword;

public interface ResultPublicationKeywordRepository{

	void delete(ResultPublicationKeyword entity);
	
	void delete(Iterable<ResultPublicationKeyword> entityList);
	
	Iterable<ResultPublicationKeyword> save(Iterable<ResultPublicationKeyword> entityList);
	
	ResultPublicationKeyword save(ResultPublicationKeyword entity);
	
	List<ResultPublicationKeyword> findByResultPublication(ResultPublication resultPublication);
	
}
