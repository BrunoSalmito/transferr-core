package br.com.transferr.core.model;

import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Where;

import br.com.transferr.core.enums.EnumLanguage;

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
	
	
	
	
	@ElementCollection
	@CollectionTable(name="LOCATION_DESCRIPTION")
	@LazyCollection(LazyCollectionOption.FALSE)
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name="value",length = 2000)
	private Map<EnumLanguage, String> descriptionLanguage;
	
	public Map<EnumLanguage, String> getDescriptionLanguage() {
		return descriptionLanguage;
	}

	public void setDescriptionLanguage(Map<EnumLanguage, String> descriptionLanguage) {
		this.descriptionLanguage = descriptionLanguage;
	}
	
	

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