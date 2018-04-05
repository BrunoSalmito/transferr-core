package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.TourOptionDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.TourOption;


@Service
public class RoleTourOption extends RoleSuperClass<TourOption> {

	
	public RoleTourOption() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private TourOptionDAO tourOptionDAO;
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
		return tourOptionDAO.getAll();
	}

}
