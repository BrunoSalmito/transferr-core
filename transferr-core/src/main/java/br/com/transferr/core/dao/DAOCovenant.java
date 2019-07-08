package br.com.transferr.core.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Covenant;



@Repository
public class DAOCovenant extends SuperClassDAO<Covenant> {

	public DAOCovenant() {
	}
	@Override
	public Covenant find(long codigo) {
		try{
			return getManager().find(Covenant.class, codigo);
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<Covenant> findOnlyActiveOnes() {
		TypedQuery<Covenant> qry = getManager().createQuery("FROM Covenant WHERE active = true", Covenant.class);
		try {
			return qry.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	

}
