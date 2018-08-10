package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
@Table(name="driver")
public class Driver  extends Entidade{

	private static final long serialVersionUID = 7098607490399840681L;

	public Driver() {
		super();
	}
	@Column(name = "name")
	private String name;
	
	@Column(name = "country_register")
	private String countryRegister;

	@Column(name = "birth_date")
	private Integer birthDate;
	
	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "ddd")
	private Integer ddd;
	
	
	@Column(name = "whatsapp")
	private Long whatsapp;
	
	
	public Long getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(Long whatsapp) {
		this.whatsapp = whatsapp;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	@ManyToOne
	@JoinColumn(name = "ID_USER" ,referencedColumnName="ID")
	private User user;

	@ManyToOne
	@JoinColumn(name = "ID_GROUP",referencedColumnName="ID",nullable=true)
	private Grouping group;
	@JsonIgnore
	@OneToOne(mappedBy="driver",fetch=FetchType.EAGER)
	private Car car;
	
	public Grouping getGroup() {
		return group;
	}

	public void setGroup(Grouping group) {
		this.group = group;
	}

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

	public Integer getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Integer birthDate) {
		this.birthDate = birthDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
	
}