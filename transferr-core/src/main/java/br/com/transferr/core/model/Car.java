package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

//import org.hibernate.annotations.ColumnDefault;

import br.com.transferr.core.enums.EnumStatus;
import br.com.transferr.core.enums.EnumTypeCar;
import br.com.transferr.core.role.RoleParametros;
import br.com.transferr.core.util.HelperVariables;



@NamedQueries({
	@NamedQuery(name=Car.FIND_BY_DRIVER,query="FROM Car c WHERE c.driver.id = :idDriver")
})

@Entity
@Table(name="Car")
public class Car  extends Entidade{
	
	private static final long serialVersionUID 	= -1934417799067460444L;
	public static final String FIND_BY_DRIVER   = "br.com.transferr.core.model.User.findByDriver";
	public Car() {
		super();
	}
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "car_identity")
	private String carIdentity;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "fl_external_Equip")
	private Boolean externalEquip;
	
	@Column(name = "nr_seats")
	private String nrSeats;
	
	@Column(name="type_car",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	@org.hibernate.annotations.ColumnDefault("0")
	private EnumTypeCar type;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "ID_DRIVER",referencedColumnName="ID",nullable=true)
	private Driver driver;
	
	@Column(name="STATUS",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private EnumStatus status;
	
	@Column(name="ALWAYS_ON_MAP",nullable=false)
	@org.hibernate.annotations.ColumnDefault("true")
	private boolean alwaysOnMap = true;

	@JsonIgnore
	@OneToOne(mappedBy="car",fetch=FetchType.EAGER)
	private CoordinateCar coordinateCar; 
	
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

	public String getPhoto() {
		return RoleParametros.paramUrlFoto+HelperVariables.docBaseRepoFiles+"/car/"+getId()+"/"+HelperVariables.DEFAULT_NAME_FOR_PHOTO;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNrSeats() {
		return nrSeats;
	}

	public void setNrSeats(String nrSeats) {
		this.nrSeats = nrSeats;
	}

	public EnumTypeCar getType() {
		return type;
	}

	public void setType(EnumTypeCar type) {
		this.type = type;
	}

	public CoordinateCar getCoordinateCar() {
		return coordinateCar;
	}

	public void setCoordinateCar(CoordinateCar coordinateCar) {
		this.coordinateCar = coordinateCar;
	}

	public boolean isAlwaysOnMap() {
		return alwaysOnMap;
	}

	public void setAlwaysOnMap(boolean alwaysOnMap) {
		this.alwaysOnMap = alwaysOnMap;
	}
	
	
	
}