package br.com.transferr.core.responses;

public class ResponsePlainTour {
	
	private long idTourOption;
	private long idDriver;
	private int seatsBusy;
	
	public long getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(long idDriver) {
		this.idDriver = idDriver;
	}
	public int getSeatsBusy() {
		return seatsBusy;
	}
	public void setSeatsBusy(int seatsBusy) {
		this.seatsBusy = seatsBusy;
	}
	public long getIdTourOption() {
		return idTourOption;
	}
	public void setIdTourOption(long idTourOption) {
		this.idTourOption = idTourOption;
	}
	
	

}
