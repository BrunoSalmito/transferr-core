package br.com.transferr.core.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Location;



@Repository
public class LocationDAO extends SuperClassDAO<Location> {

	public LocationDAO() {
	}
	@Override
	public Location find(long codigo) {
		try{
			return getManager().find(Location.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	
	public List<Location> bySubCountry(long idSubCountry) {
		try {
			return getManager().createQuery("FROM Location l WHERE l.subCountry.id = :idSubCountry", Location.class)
					.setParameter("idSubCountry", idSubCountry)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Location> byCountry(long idCountry) {
		try {
			return getManager().createQuery("FROM Location l WHERE l.subCountry.country.id = :idCountry", Location.class)
					.setParameter("idCountry", idCountry)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

}
