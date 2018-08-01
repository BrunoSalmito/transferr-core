package br.com.transferr.core.responses;

public class ResponseDriver {

	private String name;
	private String birthDate;
	private String countryRegister;
	private String email;
	private String imgProfileUrl;
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
}
