package br.com.transferr.core.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Driver;



@Repository
public class DriverDAO extends SuperClassDAO<Driver> {

	public DriverDAO() {
		 
	}
	
		@Override
	public Driver find(long codigo) {
		// TODO Auto-generated method stub
		return manager.find(Driver.class, codigo);
	}
		

}