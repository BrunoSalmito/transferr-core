package br.com.transferr.core.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Driver;
import br.com.transferr.core.model.PlainTour;



@Repository
public class PlainTourDAO extends SuperClassDAO<PlainTour> {

	public PlainTourDAO() {
	}
	@Override
	public PlainTour find(long codigo) {
		try{
			return getManager().find(PlainTour.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<PlainTour> getByDriver(Driver driver,Boolean isOpen) {
		StringBuilder query = new StringBuilder("FROM PlainTour pt WHERE ").append("\n");
		query.append(" pt.driver = :driver ");
		query.append(" AND ").append(" DATE(pt.date) >= :date").append("\n");
		query.append(" ORDER BY ").append(" pt.date ASC").append("\n");
		try {
			return manager.createQuery(query.toString(), PlainTour.class)
					.setParameter("driver", driver)
					.setParameter("date", new Date())
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<PlainTour> getByLocation(long idLocation) {
		StringBuilder query = new StringBuilder("FROM PlainTour pt WHERE ").append("\n");
		query.append(" pt.tourOption.location.id =").append(" :idLocation");
		query.append(" AND pt.date > :today");
		try {
			return manager.createQuery(query.toString(), PlainTour.class)
					.setParameter("idLocation", idLocation)
					.setParameter("today", new Date())
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<PlainTour> getByLocation(long idLocation, long idTour) {
		StringBuilder query = new StringBuilder("FROM PlainTour pt WHERE ").append("\n");
		query.append(" pt.tourOption.location.id =").append(" :idLocation");
		query.append(" AND pt.tourOption.id !=").append(" :idTour");
		query.append(" AND pt.date > :today");
		query.append(" ORDER BY date ASC");
		try {
			return manager.createQuery(query.toString(), PlainTour.class)
					.setParameter("idLocation", idLocation)
					.setParameter("idTour", idTour)
					.setParameter("today", new Date())
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<PlainTour> byTourOption(long idTourOption) {
		StringBuilder query = new StringBuilder("FROM PlainTour pt WHERE ").append("\n");
		query.append(" pt.tourOption.id =").append(" :idTourOption");
		query.append(" AND pt.date > :today");
		query.append(" ORDER BY date ASC");
		//query.append(" ORDER BY random()");
		try {
			return manager.createQuery(query.toString(), PlainTour.class)
					.setParameter("idTourOption", idTourOption)
					.setParameter("today", new Date())
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
}
