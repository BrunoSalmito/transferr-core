package br.com.transferr.core.role;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DAOStatisticContact;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Place;
import br.com.transferr.core.model.StatisticContact;
import br.com.transferr.core.util.GeoCodeAPIGoogle;


@Service
public class RoleStatisticContact extends RoleSuperClass<StatisticContact> {

	
	public RoleStatisticContact() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DAOStatisticContact daoStatisticContact;
	@Override
	public StatisticContact insert(StatisticContact entidade) throws ValidationException {
		return daoStatisticContact.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoStatisticContact.delete(codigo);
	}

	@Override
	public StatisticContact update(StatisticContact entidade) throws ValidationException {
		return daoStatisticContact.update(entidade);
	}

	@Override
	public StatisticContact find(long codigo) throws ValidationException {
		return daoStatisticContact.find(codigo);
	}
	/**
	 * 
	 * @param statisticContact
	 */
	public void registerIntetionOfContact(final StatisticContact statisticContact) {
		//new Thread(()->{
			if(statisticContact != null) {
				StatisticContact stContact = new StatisticContact();
				Place place = GeoCodeAPIGoogle.getPlaceByCoordinates(statisticContact.getLongitude(), statisticContact.getLatitude());
				if(place != null) {
					stContact.setCity(place.getCity());
					stContact.setCountry(place.getCountry());
					stContact.setState(place.getState());
				}
				stContact.setDate(new Date());
				stContact.setIdDriver(statisticContact.getIdDriver());
				stContact.setLatitude(statisticContact.getLatitude());
				stContact.setLongitude(statisticContact.getLongitude());
				stContact.setType(statisticContact.getType());
				stContact.setDevice(statisticContact.getDevice());
				daoStatisticContact.insert(stContact);
			}
			
		//}).start();
	}

}
