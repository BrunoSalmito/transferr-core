package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COORDINATE_CAR")
public class CoordinateCar  extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3580158683573139918L;

	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	
	@Column(name = "DT_LAST_UPDATE")
	private Date dtLastUpdate;


	@ManyToOne
	@JoinColumn(name = "ID_CAR" ,referencedColumnName="ID")
	private Car car;


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Date getDtLastUpdate() {
		return dtLastUpdate;
	}


	public void setDtLastUpdate(Date dtLastUpdate) {
		this.dtLastUpdate = dtLastUpdate;
	}
	
	
	
}