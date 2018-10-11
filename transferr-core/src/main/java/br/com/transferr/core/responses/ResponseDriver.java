package br.com.transferr.core.responses;

public class ResponseDriver {

	private String name;
	private String birthDate;
	private String countryRegister;
	private String email;
	private String imgProfileUrl;
	private String phone;
	private String whatsapp;
	private String nameOfCar;
	private Boolean alwaysOnMap;
	public String getName() {
		return name;
	}
	public ResponseDriver setName(String name) {
		this.name = name;
		return this;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public ResponseDriver setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	public String getCountryRegister() {
		return countryRegister;
	}
	public ResponseDriver setCountryRegister(String countryRegister) {
		this.countryRegister = countryRegister;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public ResponseDriver setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getImgProfileUrl() {
		return imgProfileUrl;
	}
	public ResponseDriver setImgProfileUrl(String imgProfileUrl) {
		this.imgProfileUrl = imgProfileUrl;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public ResponseDriver setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
		return this;
	}
	public String getNameOfCar() {
		return nameOfCar;
	}
	public ResponseDriver setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
		return this;
	}
	public Boolean getAlwaysOnMap() {
		return alwaysOnMap;
	}
	public ResponseDriver setAlwaysOnMap(Boolean alwaysOnMap) {
		this.alwaysOnMap = alwaysOnMap;
		return this;
	}
	
	
}
