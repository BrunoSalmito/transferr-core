package br.com.transferr.core.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.metadata.CoordinatesQuadrant;
import br.com.transferr.core.model.Car;
import br.com.transferr.core.model.User;
import br.com.transferr.core.responses.ResponseCarsOnline;

@Repository
public class CarDAO extends SuperClassDAO<Car> {

	public CarDAO() {

	}

	@Override
	public Car find(long codigo) {
		return manager.find(Car.class, codigo);
	}


	public Car getCarByDriver(String idDriver) {
		TypedQuery<Car> qry = getManager().createNamedQuery(Car.FIND_BY_DRIVER, Car.class)
				.setParameter("idDriver", idDriver);

		Car car = null;
		try{
			car = qry.getSingleResult();
		}catch(NoResultException e){
			return null;
		}
		return car;
	}
	
	//TODO IMPLEMENTS QUADRANT
	public  List<ResponseCarsOnline> getCarsOnline(CoordinatesQuadrant coordinates){
		StringBuilder query = new StringBuilder();
		
		query.append("SELECT                          					").append("\n");
	    query.append("    ' ' as photo,                                     ").append("\n");
	    query.append("    car.model as model,                               ").append("\n");
	    query.append("    car.identity as placa,                           ").append("\n");
	    query.append("    car.color as cor ,                               ").append("\n");
	    query.append("    driver.name as name_driver,                      ").append("\n");
	    query.append("    coordinate.latitude as latitude,                ").append("\n");
	    query.append("    coordinate.longitude as longitude              ").append("\n");
	    query.append("  from car                                          ").append("\n");
	    query.append("    inner join driver on                              ").append("\n");
	    query.append("      car.id_driver = driver.id                         ").append("\n");
	    query.append("    inner join coordinate on                          ").append("\n");
	    query.append("      coordinate.id_car = car.id                        ").append("\n");
	    query.append("  where                                             ").append("\n");
	    query.append("     car.STATUS <> 2                                  ").append("\n");

	   
	    Query qry = getManager().createNativeQuery(query.toString(), ResponseCarsOnline.class);
		
		try{
			return qry.getResultList();
		}catch(NoResultException e){
			return null;
		}
}
	
	

}