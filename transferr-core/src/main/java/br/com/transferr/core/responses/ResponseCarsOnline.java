package br.com.transferr.core.responses;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.MappedSuperclass;
import javax.persistence.SqlResultSetMapping;
@SqlResultSetMapping(
		name=ResponseCarsOnline.NAME,
		classes = @ConstructorResult(
			targetClass = ResponseCarsOnline.class,
			columns		= {
					@ColumnResult(name="id"					,type=Long.class),
					@ColumnResult(name="photo"				,type=String.class),
					@ColumnResult(name="model"				,type=String.class),
					@ColumnResult(name="placa"				,type=String.class),
					@ColumnResult(name="cor"				,type=String.class),
					@ColumnResult(name="name_driver"		,type=String.class),
					@ColumnResult(name="latitude"			,type=Double.class),
					@ColumnResult(name="longitude"			,type=Double.class),
					@ColumnResult(name="phone"			    ,type=Long.class),
					@ColumnResult(name="whatsapp"			,type=Long.class),
					@ColumnResult(name="ddd"			    ,type=Integer.class)
				    
					
			}
		)	
	)
@MappedSuperclass
public class ResponseCarsOnline {

	public static final String NAME = "br.com.transferr.core.responses.ResponseCarsOnline";
	private Long id;
	private String photo;
	private String model;
	private String placa;
	private String cor;
	private String name;
	private Double latitude;
	private Double longitude;
	private Long phone;
	private Long whatsapp;
	private Integer ddd;
	
	public ResponseCarsOnline() {
		
	}
	
	
	public ResponseCarsOnline(Long id, String photo, String model, String placa, String cor, String name,
			Double latitude, Double longitude,Long phone, Long whatsapp,Integer ddd) {
		super();
		this.id = id;
		this.photo = photo;
		this.model = model;
		this.placa = placa;
		this.cor = cor;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.phone = phone;
		this.whatsapp = whatsapp;
		this.ddd = ddd;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public Long getWhatsapp() {
		return whatsapp;
	}


	public void setWhatsapp(Long whatsapp) {
		this.whatsapp = whatsapp;
	}


	public Integer getDdd() {
		return ddd;
	}


	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	

	
}
