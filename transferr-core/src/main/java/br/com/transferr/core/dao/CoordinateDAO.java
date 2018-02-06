package br.com.transferr.core.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Coordinate;



@Repository
public class CoordinateDAO extends SuperClassDAO<Coordinate> {

	public CoordinateDAO() {
		 
	}
	
		@Override
	public Coordinate find(long codigo) {
		// TODO Auto-generated method stub
		return manager.find(Coordinate.class, codigo);
	}
		

}