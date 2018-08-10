package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="plain_tour")
public class PlainTour  extends Entidade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -674774561676778290L;

	@Column(name = "date")
	private Date date;
	
	@Column(name = "seats_remaining")
	private int seatsRemaining;
	
	@ManyToOne
	@JoinColumn(name = "ID_DRIVER",referencedColumnName="ID",nullable=true)
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name = "ID_TOUR_OPTION",referencedColumnName="ID",nullable=true)
	private TourOption tourOption;
	
	/**
	 * When it 'true' means that the driver still looking for passengers to complete the tour.
	 */
	@Column(name="IS_OPEN",nullable=false)
	@org.hibernate.annotations.ColumnDefault("true")
	private Boolean open = Boolean.TRUE;
	
	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

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
