package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.com.transferr.core.enums.EnumTypeOfDriver;


@Entity
@Table(name="driver")
public class Driver  extends Entidade{

	enum TypeID{
		OTHER,
		CPF,
		RG,
		CNPJ
	}
	private static final long serialVersionUID = 7098607490399840681L;

	public Driver() {
		super();
	}
	@Column(name = "name")
	private String name;
	
	@Column(name = "country_register")
	private String countryRegister;

	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "ddd")
	private Integer ddd;

	@Column(name = "identity", nullable=true)
	private String identity = "";
	@Column(name = "type_id", nullable=true)
	@Enumerated(EnumType.ORDINAL)
	private TypeID typeId = TypeID.OTHER;
	
	@Column(name = "whatsapp")
	private Long whatsapp;
	
	@ManyToOne
	@JoinColumn(name = "ID_USER" ,referencedColumnName="ID")
	private User user;

	@ManyToOne
	@JoinColumn(name = "ID_GROUP",referencedColumnName="ID",nullable=true)
	private Grouping group;
	//@JsonIgnore
	@OneToOne(mappedBy="driver",fetch=FetchType.EAGER)
	private Car car;
	@Column(name="TYPE_OF_DRIVER",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	@org.hibernate.annotations.ColumnDefault("0")
	private EnumTypeOfDriver typeOfDriver = EnumTypeOfDriver.DRIVER;
	
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
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

	public EnumTypeOfDriver getTypeOfDriver() {
		return typeOfDriver;
	}

	public void setTypeOfDriver(EnumTypeOfDriver typeOfDriver) {
		this.typeOfDriver = typeOfDriver;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public TypeID getTypeId() {
		return typeId;
	}

	public void setTypeId(TypeID typeId) {
		this.typeId = typeId;
	}
	
	
}