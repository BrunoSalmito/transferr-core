package br.com.transferr.core.responses;

import br.com.transferr.core.enums.EnumStatus;

public class ResponseCarOnline {
	
	private Long idCar;
	private EnumStatus status;
	
	public Long getIdCar() {
		return idCar;
	}
	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	
	
}
