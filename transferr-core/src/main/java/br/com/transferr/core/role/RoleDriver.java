package br.com.transferr.core.role;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DriverDAO;
import br.com.transferr.core.dao.PlainTourDAO;
import br.com.transferr.core.enums.EnumStatus;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Car;
import br.com.transferr.core.model.CoordinateCar;
import br.com.transferr.core.model.Driver;
import br.com.transferr.core.model.PlainTour;
import br.com.transferr.core.responses.ResponseDriver;
import br.com.transferr.core.responses.ResponseDriverByTourOption;
import br.com.transferr.core.responses.ResponseDrivers;
import br.com.transferr.core.util.HelperBase64;
import br.com.transferr.core.util.HelperGeoFunctions;
import br.com.transferr.core.util.HelperNumberFormat;
import br.com.transferr.core.util.HelperVariables;

@Service
public class RoleDriver  extends RoleSuperClass<Driver> {

	
	public RoleDriver() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DriverDAO driverDAO;
	@Autowired
	private PlainTourDAO plainTourDAO;
	@Override
	public Driver insert(Driver entidade) throws ValidationException {
		return driverDAO.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		driverDAO.delete(codigo);
	}

	@Override
	public Driver update(Driver entidade) throws ValidationException {
		return driverDAO.update(entidade);
	}

	@Override
	public Driver find(long codigo) throws ValidationException {
		return driverDAO.find(codigo);
	}
	
	

	
	public void saveProfilePhotosOnFileSystem(String idCar , String base64Photo) {
		if(base64Photo != null && base64Photo.trim().isEmpty() == false){
			try {
				File file = checkAndCreateTheImagesServerRepository(idCar);
				File fileImage = new File(file.getAbsolutePath()+File.separator+HelperVariables.DEFAULT_NAME_FOR_PHOTO);
				System.out.println("Directory image file:"+fileImage.getAbsolutePath());
				HelperBase64.toFile(base64Photo, fileImage);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private File checkAndCreateTheImagesServerRepository(String idCar) {
		File file = new File(RoleParametros.paramPathRepoImagens+File.separator+"car"+File.separator+idCar);
		if(!file.exists()){
			file.mkdirs();
		}
		return file;
	}
	
	public Driver getDriverByCar(Long idCar) throws ValidationException {
		Driver driver = driverDAO.getDriverByCar(idCar);
		if(driver != null){
			return driver;
		}
		throw new ValidationException("Nenum motorista encontrado para este Veículo.");
	}
	
	public List<ResponseDriverByTourOption> byTourOption(long idTourOption) {
		List<PlainTour> plains = plainTourDAO.byTourOption(idTourOption);
		List<ResponseDriverByTourOption> response = null;
		if(plains != null){
			for (PlainTour plainTour : plains) {
				ResponseDriverByTourOption responseDriver = new ResponseDriverByTourOption();
				Driver driver = plainTour.getDriver();
				Car car = driver.getCar();
				String formatedDistance = getDistance(car);
				responseDriver.setDistance(formatedDistance);
				responseDriver.setName(driver.getName());
				responseDriver.setOnline(isOnline(car));
				responseDriver.setTelephone("(85)958541254");
				responseDriver.setValue( formatDecimalToCurrency(plainTour.getTourOption().getValue()));
			}
		}
		return response;
	}

	private boolean isOnline(Car car) {
		return !car.getStatus().equals(EnumStatus.OFFLINE);
	}

	private String getDistance(Car car) {
		CoordinateCar coordinateCar = car.getCoordinateCar();
		float distanceFromPointsInKm = HelperGeoFunctions.distanceFromPointsInKm(coordinateCar.getLatitude().floatValue()	, 
												  coordinateCar.getLongitude().floatValue()	, 
												  coordinateCar.getLatitude().floatValue()	, 
												  coordinateCar.getLongitude().floatValue());
		String formatedDistance = HelperNumberFormat.formatDistance(String.valueOf(distanceFromPointsInKm));
		return formatedDistance;
	}
	
	private String formatDecimalToCurrency(BigDecimal value) {
		return HelperNumberFormat.currencyFormat(value);
	}
	public List<Driver> byLocation(Long idLocation) {
		return driverDAO.byLocation(idLocation);
	}
	
	public ResponseDrivers listByLocation(Long idLocation) {
		ResponseDrivers responseDrivers = new ResponseDrivers();
		byLocation(idLocation).forEach(driver->{
			ResponseDriver resp = new ResponseDriver()
				.setBirthDate("Idade 36")
				.setCountryRegister(driver.getCar().getCarIdentity())
				.setEmail(driver.getUser().getEmail())
				.setImgProfileUrl(driver.getCar().getPhoto())
				.setName(driver.getName())
				.setWhatsapp(String.valueOf(driver.getWhatsapp()))
				.setNameOfCar(driver.getCar().getModel())
				.setAlwaysOnMap(driver.getCar().isAlwaysOnMap());
			String phoneNumber = "Não informado.";
			if(driver.getDdd() != null && driver.getPhone() != null) {
				Integer ddd = driver.getDdd();
				Long phone = driver.getPhone();
				if(ddd > 0 && phone > 0) {
					//phoneNumber = String.format("(%s) %s", ddd,phone);
					phoneNumber = String.format("+55%s%s", ddd,phone);
				}
			}
			resp.setPhone(phoneNumber);
			responseDrivers.getDrivers().add(resp);
		});
		return responseDrivers;
	}
	
	public Driver findByUserID(long userId) {
		return driverDAO.findByUserID(userId);
	}
	
}
