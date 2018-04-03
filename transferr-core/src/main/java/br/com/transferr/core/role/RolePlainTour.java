package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.PlainTourDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Driver;
import br.com.transferr.core.model.PlainTour;


@Service
public class RolePlainTour extends RoleSuperClass<PlainTour> {

	
	public RolePlainTour() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private PlainTourDAO plainTourDAO;
	@Autowired
	private RoleDriver roleDriver;
	@Override
	public PlainTour insert(PlainTour entidade) throws ValidationException {
		return plainTourDAO.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		plainTourDAO.delete(codigo);
	}

	@Override
	public PlainTour update(PlainTour entidade) throws ValidationException {
		return plainTourDAO.update(entidade);
	}

	@Override
	public PlainTour find(long codigo) throws ValidationException {
		return plainTourDAO.find(codigo);
	}
	
	public List<PlainTour> getDriverOpenPlainTour(long idDriver) throws ValidationException {
		Driver driver = roleDriver.find(idDriver);
		if(driver == null){
			throw new ValidationException("Motorista não encontrado");
		}
		return plainTourDAO.getByDriver(driver , Boolean.TRUE);
	}

}
