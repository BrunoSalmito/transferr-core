package br.com.transferr.core.role;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.TourOptionDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Driver;
import br.com.transferr.core.model.TourOption;


@Service
public class RoleTourOption extends RoleSuperClass<TourOption> {

	
	public RoleTourOption() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private TourOptionDAO tourOptionDAO;
	@Autowired
	private RoleDriver roleDriver;
	@Override
	public TourOption insert(TourOption entidade) throws ValidationException {
		return tourOptionDAO.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		tourOptionDAO.delete(codigo);
	}

	@Override
	public TourOption update(TourOption entidade) throws ValidationException {
		return tourOptionDAO.update(entidade);
	}

	@Override
	public TourOption find(long codigo) throws ValidationException {
		return tourOptionDAO.find(codigo);
	}
	
	public List<TourOption> getAll() {
		System.out.println("Role get all tour option");
		List<TourOption> list = tourOptionDAO.getAll();
//		List<TourOption> listToReturn = new ArrayList<>();
//		list.forEach(tour ->{
//			TourOption t = new TourOption();
//			t.setDescription(description);
//			listToReturn.add(t);
//		});
		return list;
	}
	public List<TourOption> getByLocation(long idLocation) {
		return tourOptionDAO.getByLocation(idLocation);
	}
	
	
	
	public List<TourOption> getTourOptionByDriver(long idDriver) throws ValidationException {
		Driver driver = roleDriver.find(idDriver);
		if(driver == null) {
			System.err.println("No Driver with id "+idDriver);
			throw new ValidationException("Nenhum motorista encontrado.");
		}
		return tourOptionDAO.getByLocation(driver.getGroup().getLocation().getId());
	}
	

}
