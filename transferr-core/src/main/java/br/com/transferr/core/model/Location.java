package br.com.transferr.core.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location   extends Entidade {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6696481321739833579L;

	@ManyToOne
	@JoinColumn(name = "ID_SUB_COUNTRY",referencedColumnName="ID",nullable=true)
	private SubCountry subCountry;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "photo_profile")
    private String photoProfile;
	@Column(name = "description")
	private String description;
	
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubCountry getSubCountry() {
		return subCountry;
	}

	public void setSubCountry(SubCountry subCountry) {
		this.subCountry = subCountry;
	}

	public String getPhotoProfile() {
		return photoProfile;
	}

	public void setPhotoProfile(String photoProfile) {
		this.photoProfile = photoProfile;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}