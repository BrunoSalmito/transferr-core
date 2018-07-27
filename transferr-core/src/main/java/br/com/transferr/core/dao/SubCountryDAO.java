package br.com.transferr.core.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.SubCountry;



@Repository
public class SubCountryDAO extends SuperClassDAO<SubCountry> {

	public SubCountryDAO() {
	}
	@Override
	public SubCountry find(long codigo) {
		try{
			return getManager().find(SubCountry.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<SubCountry> getAll() {
		try {
			return manager.createQuery("FROM SubCountry", SubCountry.class).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<SubCountry> getByCountry(Long idCountry) {
		try {
			return manager.createQuery("FROM SubCountry WHERE country.id = :idCountry", SubCountry.class)
					.setParameter("idCountry", idCountry)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

}
