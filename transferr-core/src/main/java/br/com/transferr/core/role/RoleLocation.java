package br.com.transferr.core.role;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.LocationDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Location;
import br.com.transferr.core.responses.ResponseLocation;

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
	
	public List<Location> byCountry(long idCountry) {
		return locationDAO.byCountry(idCountry);
	}
	
	public List<ResponseLocation> getResponseBySubCountry(long idSubCountry) {
		List<ResponseLocation> resultList = new ArrayList<>();
		bySubCountry(idSubCountry).forEach(sub->{
			ResponseLocation response = new ResponseLocation();
			response.setId(sub.getId());
			response.setName(sub.getName());
			response.setUrlMainPicture(sub.getPhotoProfile());
			resultList.add(response );
		});
		return resultList;
	}

}
