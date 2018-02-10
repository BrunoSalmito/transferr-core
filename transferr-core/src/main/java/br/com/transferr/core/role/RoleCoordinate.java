package br.com.transferr.core.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.CoordinateDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Coordinate;


@Service
public class RoleCoordinate extends RoleSuperClass<Coordinate> {

	
	public RoleCoordinate() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private CoordinateDAO coordinateDao;
	@Override
	public Coordinate insert(Coordinate entidade) throws ValidationException {
		return coordinateDao.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		coordinateDao.delete(codigo);
	}

	@Override
	public Coordinate update(Coordinate entidade) throws ValidationException {
		return coordinateDao.update(entidade);
	}

	@Override
	public Coordinate find(long codigo) throws ValidationException {
		return coordinateDao.find(codigo);
	}

}
