package br.com.transferr.core.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Car;

@Repository
public class CarDAO extends SuperClassDAO<Car> {

	public CarDAO() {
		 
	}
	
		@Override
	public Car find(long codigo) {
		// TODO Auto-generated method stub
		return manager.find(Car.class, codigo);
	}
		

}