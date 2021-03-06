package gr.ekt.cerif.services.multilingual.resultpublication;


import java.util.List;

import gr.ekt.cerif.entities.result.ResultPublication;
import gr.ekt.cerif.features.multilingual.ResultPublicationTitle;

public interface ResultPublicationTitleRepository {
	
	List<ResultPublicationTitle> findByResultPublication(ResultPublication resultPublication);
	
	void delete(ResultPublicationTitle entity);
	
	void delete(Iterable<ResultPublicationTitle> entityList);
	
	Iterable<ResultPublicationTitle> save(Iterable<ResultPublicationTitle> entityList);
	
	ResultPublicationTitle save(ResultPublicationTitle entity);

	
}
