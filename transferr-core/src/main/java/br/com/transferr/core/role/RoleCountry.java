package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DAOCountry;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Country;


@Service
public class RoleCountry extends RoleSuperClass<Country> {

	
	public RoleCountry() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DAOCountry daoCounty;
	@Override
	public Country insert(Country entidade) throws ValidationException {
		return daoCounty.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoCounty.delete(codigo);
	}

	@Override
	public Country update(Country entidade) throws ValidationException {
		return daoCounty.update(entidade);
	}

	@Override
	public Country find(long codigo) throws ValidationException {
		return daoCounty.find(codigo);
	}
	
	public List<Country> getAll() {
		return daoCounty.getAll();
	}

}
