package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.SubCountryDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.SubCountry;


@Service
public class RoleSubcountry extends RoleSuperClass<SubCountry> {

	
	public RoleSubcountry() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private SubCountryDAO subCountryDAO;
	@Override
	public SubCountry insert(SubCountry entidade) throws ValidationException {
		return subCountryDAO.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		subCountryDAO.delete(codigo);
	}

	@Override
	public SubCountry update(SubCountry entidade) throws ValidationException {
		return subCountryDAO.update(entidade);
	}

	@Override
	public SubCountry find(long codigo) throws ValidationException {
		return subCountryDAO.find(codigo);
	}
	public List<SubCountry> getAll() {
		return subCountryDAO.getAll();
	}

}
