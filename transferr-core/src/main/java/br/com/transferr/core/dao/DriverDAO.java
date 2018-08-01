package br.com.transferr.core.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Car;
import br.com.transferr.core.model.Driver;



@Repository
public class DriverDAO extends SuperClassDAO<Driver> {

	public DriverDAO() {
		 
	}

	
	@Override
	public Driver find(long codigo) {
		return manager.find(Driver.class, codigo);
	}
		
	public Driver getDriverByCar(Long idCar) {
		String jpql = "FROM Car WHERE id = :idCar";
		TypedQuery<Car> query = getManager().createQuery(jpql, Car.class).setParameter("idCar", idCar);
		try {
			Car car = query.getSingleResult();
			if(car != null){
				return car.getDriver();
			}
			return null;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Driver> byLocation(Long idLocation) {
		try {
			return getManager().createQuery("FROM Driver WHERE group.location.id = :idLocation",Driver.class)
					.setParameter("idLocation", idLocation)
					.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<>();
		}catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

}