package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.transferr.core.enums.EnumStatus;

@Entity
@Table(name="Car")
public class Car  extends Entidade{
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "car_identity")
	private String carIdentity;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "fl_external_Equip")
	private Boolean externalEquip;
	
	@OneToOne
	@JoinColumn(name = "ID_DRIVER",referencedColumnName="ID",nullable=true)
	private Driver driver;
	
	@Column(name="TP_ANIMAL",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private EnumStatus status;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarIdentity() {
		return carIdentity;
	}

	public void setCarIdentity(String carIdentity) {
		this.carIdentity = carIdentity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getExternalEquip() {
		return externalEquip;
	}

	public void setExternalEquip(Boolean externalEquip) {
		this.externalEquip = externalEquip;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	
	
}