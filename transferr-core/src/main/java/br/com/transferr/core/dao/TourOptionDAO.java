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

}