package br.com.transferr.core.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import br.com.transferr.core.enums.EnumLanguage;


@Entity
@Table(name="tour_option")
public class TourOption  extends Entidade {

	private static final long serialVersionUID = -2165874079626914848L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "value",precision=10,scale=2)
	private BigDecimal value;
	
	@ManyToOne
	@JoinColumn(name = "ID_LOCATION",referencedColumnName="ID",nullable=true)
	private Location location;
	
	@Column(name = "profile_url")
	private String profileUrl;
	
	@Column(name = "short_description")
	private String shortDescription;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.EAGER)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
	  name = "TOUR_DRIVER", 
	  joinColumns = @JoinColumn(name = "ID_TOUR_OPTION"), 
	  inverseJoinColumns = @JoinColumn(name = "ID_DRIVER"))
	Set<Driver> drivers;
	


	
	@ElementCollection
	@CollectionTable(name="TOUR_OPTION_DESCRIPTION")
	@LazyCollection(LazyCollectionOption.FALSE)
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name="value",length = 2000)
	private Map<EnumLanguage, String> descriptionLanguage;
	
	public Map<EnumLanguage, String> getDescriptionLanguage() {
		return descriptionLanguage;
	}

	public TourOption setDescriptionLanguage(Map<EnumLanguage, String> descriptionLanguage) {
		this.descriptionLanguage = descriptionLanguage;
		return this;
	}
	
	@ElementCollection
	@CollectionTable(name="TOUR_OPTION_SHORT_DESCRIPTION")
	@LazyCollection(LazyCollectionOption.FALSE)
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name="value",length = 2000)
	private Map<EnumLanguage, String> shortDescriptionLanguage;
	
	
	
	
	public Map<EnumLanguage, String> getShortDescriptionLanguage() {
		return shortDescriptionLanguage;
	}

	public TourOption setShortDescriptionLanguage(Map<EnumLanguage, String> shortDescriptionLanguage) {
		this.shortDescriptionLanguage = shortDescriptionLanguage;
		return this;
	}

	public String getName() {
		return name;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public TourOption setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
		return this;
	}

	public TourOption setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TourOption setDescription(String description) {
		this.description = description;
		return this;
	}

	public BigDecimal getValue() {
		return value;
	}

	public TourOption setValue(BigDecimal value) {
		this.value = value;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public TourOption setLocation(Location location) {
		this.location = location;
		return this;
	}
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="tour_option_images", joinColumns=@JoinColumn(name="tour_option_id"))
	@Column(name="image_path")
	private List<String> images;

	public List<String> getImages() {
		return images;
	}

	public TourOption setImages(List<String> images) {
		this.images = images;
		return this;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public TourOption setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
		return this;
	}

	public Set<Driver> getDrivers() {
		return drivers;
	}

	public TourOption setDrivers(Set<Driver> drivers) {
		this.drivers = drivers;
		return this;
	}
	
	
	
	
}
