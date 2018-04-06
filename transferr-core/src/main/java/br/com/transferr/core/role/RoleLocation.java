package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.LocationDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Location;
import br.com.transferr.core.model.SubCountry;


@Service
public class RoleLocation extends RoleSuperClass<Location> {

	
	public RoleLocation() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private LocationDAO locationDAO;
	@Override
	public Location insert(Location entidade) throws ValidationException {
		return locationDAO.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		locationDAO.delete(codigo);
	}

	@Override
	public Location update(Location entidade) throws ValidationException {
		return locationDAO.update(entidade);
	}

	@Override
	public Location find(long codigo) throws ValidationException {
		return locationDAO.find(codigo);
	}
	
	public List<Location> bySubCountry(long idSubCountry) {
		return locationDAO.bySubCountry(idSubCountry);
	}

}
