package br.com.transferr.core.dao;

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
	

}
