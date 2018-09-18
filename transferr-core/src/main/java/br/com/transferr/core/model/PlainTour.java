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
	
	
	private String namePassenger1;
	private String telPassenger1;
	private String notesPassenger1;
	
	private String namePassenger2;
	private String telPassenger2;
	private String notesPassenger2;
	
	private String namePassenger3;
	private String telPassenger3;
	private String notesPassenger3;
	
	private String notesOfPlain;
	
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

	public String getNamePassenger1() {
		return namePassenger1;
	}

	public void setNamePassenger1(String namePassenger1) {
		this.namePassenger1 = namePassenger1;
	}

	public String getTelPassenger1() {
		return telPassenger1;
	}

	public void setTelPassenger1(String telPassenger1) {
		this.telPassenger1 = telPassenger1;
	}

	public String getNotesPassenger1() {
		return notesPassenger1;
	}

	public void setNotesPassenger1(String notesPassenger1) {
		this.notesPassenger1 = notesPassenger1;
	}

	public String getNamePassenger2() {
		return namePassenger2;
	}

	public void setNamePassenger2(String namePassenger2) {
		this.namePassenger2 = namePassenger2;
	}

	public String getTelPassenger2() {
		return telPassenger2;
	}

	public void setTelPassenger2(String telPassenger2) {
		this.telPassenger2 = telPassenger2;
	}

	public String getNotesPassenger2() {
		return notesPassenger2;
	}

	public void setNotesPassenger2(String notesPassenger2) {
		this.notesPassenger2 = notesPassenger2;
	}

	public String getNamePassenger3() {
		return namePassenger3;
	}

	public void setNamePassenger3(String namePassenger3) {
		this.namePassenger3 = namePassenger3;
	}

	public String getTelPassenger3() {
		return telPassenger3;
	}

	public void setTelPassenger3(String telPassenger3) {
		this.telPassenger3 = telPassenger3;
	}

	public String getNotesPassenger3() {
		return notesPassenger3;
	}

	public void setNotesPassenger3(String notesPassenger3) {
		this.notesPassenger3 = notesPassenger3;
	}

	public String getNotesOfPlain() {
		return notesOfPlain;
	}

	public void setNotesOfPlain(String notesOfPlain) {
		this.notesOfPlain = notesOfPlain;
	}

	
	
	
	
}
