package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DAOCovenant;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Covenant;


@Service
public class RoleCovenant extends RoleSuperClass<Covenant> {

	
	public RoleCovenant() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DAOCovenant daoCovenant;
	@Override
	public Covenant insert(Covenant entidade) throws ValidationException {
		return daoCovenant.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoCovenant.delete(codigo);
	}

	@Override
	public Covenant update(Covenant entidade) throws ValidationException {
		return daoCovenant.update(entidade);
	}

	@Override
	public Covenant find(long codigo) throws ValidationException {
		return daoCovenant.find(codigo);
	}
	
	public List<Covenant> findOnlyActiveOnes() {
		return daoCovenant.findOnlyActiveOnes();
	}

}
