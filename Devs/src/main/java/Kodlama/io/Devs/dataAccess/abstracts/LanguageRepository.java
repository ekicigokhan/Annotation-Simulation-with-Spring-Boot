package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAllLanguages();
	
	void add(Language language); 
	void delete(int id);
	void update(int id, Language language)throws Exception;
	
	Language getById(int id)throws Exception;
}
