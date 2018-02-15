package br.com.transferr.core.responses;

public class RequestCoordinatesUpdate {

	private Double latitude;
	private Double longitude;
	private Integer idDriver;
	
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
	public Integer getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(Integer idDriver) {
		this.idDriver = idDriver;
	}
	
	
	
}
