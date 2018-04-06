package br.com.transferr.core.role;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.PlainTourDAO;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Driver;
import br.com.transferr.core.model.PlainTour;
import br.com.transferr.core.model.TourOption;
import br.com.transferr.core.responses.ResponsePlainTour;


@Service
public class RolePlainTour extends RoleSuperClass<PlainTour> {

	
	public RolePlainTour() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private PlainTourDAO plainTourDAO;
	@Autowired
	private RoleDriver roleDriver;
	@Autowired
	private RoleTourOption roleTourOption;
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
	
	public PlainTour insert(ResponsePlainTour responsePlainTour) throws ValidationException {
		PlainTour plainTour = new PlainTour();
		if(responsePlainTour != null) {
			long idDriver = responsePlainTour.getIdDriver();
			long idTourOption = responsePlainTour.getIdTourOption();
			int seatsBusy = responsePlainTour.getSeatsBusy();
			Driver driver = roleDriver.find(idDriver);
			if(driver == null) {
				throw new ValidationException("Motorista não cadastrado!");
			}
			
			TourOption tourOption = roleTourOption.find(idTourOption);
			if(tourOption == null) {
				throw new ValidationException("Opção de passeio não encontrada!");
			}
			plainTour.setDate(new Date());
			plainTour.setDriver(driver);
			plainTour.setOpen(true);
			plainTour.setSeatsRemaining(seatsBusy);
			plainTour.setTourOption(tourOption);
			plainTour = insert(plainTour);
		}
		return plainTour;
	}
	/**
	 * Increase or decrease the number of seats for a tour.
	 * @param idPlainTour
	 * @param seats
	 * @return
	 * @throws ValidationException
	 */
	public PlainTour increseSeats(long idPlainTour,int seats) throws ValidationException {
		PlainTour plainTour = find(idPlainTour);
		if(plainTour == null){
			throw new ValidationException("Passeio não encontrado");
		}
		int seatsRemaining = plainTour.getSeatsRemaining();
		seatsRemaining = seatsRemaining - seats;
		if(seatsRemaining < 0){
			throw new ValidationException("O némero de passageiros " + seats + " resultou em um número negativo de assentos");
		}
		plainTour.setSeatsRemaining(seatsRemaining);
		plainTour = update(plainTour);
		return plainTour;
	}
	
	public List<PlainTour> getByLocation(long idLocation) {
		return plainTourDAO.getByLocation(idLocation);
	}

}
