package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="driver")
public class Driver  extends Entidade{

	@Column(name = "name")
	private String name;
	
	@Column(name = "country_register")
	private String countryRegister;

	@Column(name = "birth_date")
	private Date birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryRegister() {
		return countryRegister;
	}

	public void setCountryRegister(String countryRegister) {
		this.countryRegister = countryRegister;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
	
}