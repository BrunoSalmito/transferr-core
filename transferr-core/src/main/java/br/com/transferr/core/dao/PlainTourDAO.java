package br.com.transferr.core.dao;

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
		query.append(" AND ").append(" pt.open = :isOpen");
		try {
			return manager.createQuery(query.toString(), PlainTour.class)
					.setParameter("driver", driver)
					.setParameter("isOpen", isOpen)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
}
