package br.com.transferr.core.responses;

import java.util.List;

import br.com.transferr.core.model.PlainTour;

public class ResponsePlainsByTourAndLocation {
	
	private List<PlainTour> plainsFromTour;
    private List<PlainTour> plainsFromLocation;
	public List<PlainTour> getPlainsFromTour() {
		return plainsFromTour;
	}
	public void setPlainsFromTour(List<PlainTour> plainsFromTour) {
		this.plainsFromTour = plainsFromTour;
	}
	public List<PlainTour> getPlainsFromLocation() {
		return plainsFromLocation;
	}
	public void setPlainsFromLocation(List<PlainTour> plainsFromLocation) {
		this.plainsFromLocation = plainsFromLocation;
	}
    
    
}
