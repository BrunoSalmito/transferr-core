package br.com.transferr.core.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Country;



@Repository
public class DAOCountry extends SuperClassDAO<Country> {

	public DAOCountry() {
	}
	@Override
	public Country find(long codigo) {
		try{
			return getManager().find(Country.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<Country> getAll() {
		try {
			return getManager().createQuery("FROM Country",Country.class)
					.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<>();
		}catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

}
