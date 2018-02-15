package br.com.transferr.core.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.CoordinateCar;



@Repository
public class CoordinateCarDAO extends SuperClassDAO<CoordinateCar> {

	public CoordinateCarDAO() {
		 
	}
	
	@Override
	public CoordinateCar find(long codigo) {
		return manager.find(CoordinateCar.class, codigo);
	}
	
	
		

}