package br.com.transferr.core.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DAOTourist;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Tourist;


@Service
public class RoleTourist extends RoleSuperClass<Tourist> {

	
	public RoleTourist() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DAOTourist daoTourist;
	@Override
	public Tourist insert(Tourist entidade) throws ValidationException {
		Tourist turByEmail = findByEmail(entidade.getEmail());
		if(turByEmail != null) {
			return turByEmail;
		}
		return daoTourist.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoTourist.delete(codigo);
	}

	@Override
	public Tourist update(Tourist entidade) throws ValidationException {
		return daoTourist.update(entidade);
	}

	@Override
	public Tourist find(long codigo) throws ValidationException {
		return daoTourist.find(codigo);
	}

	public Tourist findByEmail(final String email) {
		return daoTourist.findByEmail(email);
	}
}
