package br.com.transferr.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.model.Car;

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