package br.com.transferr.core.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.StatisticContact;



@Repository
public class DAOStatisticContact extends SuperClassDAO<StatisticContact> {

	public DAOStatisticContact() {
	}
	@Override
	public StatisticContact find(long codigo) {
		try{
			return getManager().find(StatisticContact.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public void exempleHowToManuallyRemoveInstancesFromPersistenceContext() {
		StatisticContact exemplo = find(1l);
		//You don't have to wait for the persistence context to close.
		//You can evict entity instances manually
		getManager().detach(exemplo);
		if(getManager().contains(exemplo)){
			//It will never enter here because the entity was removed
		}
		//Any changes has no effect
	}

}
