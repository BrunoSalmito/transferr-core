package br.com.transferr.core.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location   extends Entidade {

	@OneToMany
	@JoinColumn(name = "ID_SUB_COUNTRY",referencedColumnName="ID",nullable=true)
	private SubCountry subCountry;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "photo_profile")
    private String photoProfile;
	
	
	@CollectionTable(name="Location_images")
	private List<String> images;


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

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	
	
	
	
}