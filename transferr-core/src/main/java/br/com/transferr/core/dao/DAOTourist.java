package br.com.transferr.core.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Tourist;



@Repository
public class DAOTourist extends SuperClassDAO<Tourist> {

	public DAOTourist() {
	}
	@Override
	public Tourist find(long codigo) {
		try{
			return getManager().find(Tourist.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public Tourist findByEmail(final String email) {
		try {
			return getManager().createNamedQuery(Tourist.FIND_BY_EMAIL, Tourist.class)
					.setParameter("email", email)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
//		catch (Exception e) {
//			// NOTE: do not crash the app, just register it
//			System.err.println(e.getMessage());
//			e.printStackTrace();
//			throw new Data
//		}
	}
	
	
	

}
