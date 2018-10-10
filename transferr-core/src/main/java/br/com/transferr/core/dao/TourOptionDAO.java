package br.com.transferr.core.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.TourOption;



@Repository
public class TourOptionDAO extends SuperClassDAO<TourOption> {

	public TourOptionDAO() {
	}
	@Override
	public TourOption find(long codigo) {
		try{
			return getManager().find(TourOption.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<TourOption> getAll() {
		try {
			return manager.createQuery("FROM TourOption", TourOption.class).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<TourOption> getByLocation(long idLocation) {
		try {
			StringBuilder query = new StringBuilder("FROM TourOption t WHERE").append("\n");
			query.append(" location.id = :idLocation").append("\n");
			return manager.createQuery(query.toString(), TourOption.class)
					.setParameter("idLocation", idLocation)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	/*
	public List<TourOption> getTourOptionByDriver(long idDriver) {
		try {
			StringBuilder query = new StringBuilder("SELECT t FROM TourOption t INNER JOIN Driver d WHERE").append("\n");
			query.append(" t.location.id = d.group.location.id").append("\n");
			query.append(" AND d.id = :idDriver").append("\n");
			return manager.createQuery(query.toString(), TourOption.class)
					.setParameter("idDriver", idDriver)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	*/

}
