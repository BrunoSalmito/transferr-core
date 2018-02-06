package br.com.transferr.core.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.core.model.Car;
import br.com.transferr.core.model.User;




@Repository
public class UserDAO extends SuperClassDAO<User> {

	public UserDAO() {
		 
	}
	
		@Override
	public User find(long codigo) {
		// TODO Auto-generated method stub
		return manager.find(User.class, codigo);
	}
		

}