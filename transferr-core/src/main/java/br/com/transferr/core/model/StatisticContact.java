package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.transferr.core.enums.EnumDeviceType;
import br.com.transferr.core.enums.EnumTypeContact;

@Entity
@Table(name="STATISTIC_CONTAC")
public class StatisticContact extends Entidade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5628769474115083909L;
	private long idDriver;
	@Enumerated(EnumType.ORDINAL)
	private EnumTypeContact type;
	private Date date;
	private double longitude;
	private double latitude;
	private String city;
	private String state;
	private String country;
	private EnumDeviceType device;
	public long getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(long idDriver) {
		this.idDriver = idDriver;
	}
	public EnumTypeContact getType() {
		return type;
	}
	public void setType(EnumTypeContact type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public EnumDeviceType getDevice() {
		return device;
	}
	public void setDevice(EnumDeviceType device) {
		this.device = device;
	}
	
	
}
