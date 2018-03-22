package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="plain_tour")
public class PlainTour  extends Entidade{
	
	@Column(name = "date")
	public Date date;
	
	@Column(name = "seats_remaining")
	public int seatsRemaining;
	
	@OneToMany
	@JoinColumn(name = "ID_DRIVER",referencedColumnName="ID",nullable=true)
	public Driver driver;
	
	@OneToMany
	@JoinColumn(name = "ID_TOUR_OPTION",referencedColumnName="ID",nullable=true)
	private TourOption tourOption;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public TourOption getTourOption() {
		return tourOption;
	}

	public void setTourOption(TourOption tourOption) {
		this.tourOption = tourOption;
	}

	
	
	
	
}
