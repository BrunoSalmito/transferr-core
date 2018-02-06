package br.com.transferr.dao;

import org.springframework.stereotype.Repository;

import br.com.transferr.model.Car;
import br.com.transferr.model.User;




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