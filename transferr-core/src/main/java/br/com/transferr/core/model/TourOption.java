package br.com.transferr.core.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.FilterJoinTable;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Where;

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
	


	
	@ElementCollection
	@CollectionTable(name="TOUR_OPTION_DESCRIPTION")
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
	
	@ElementCollection
	@CollectionTable(name="TOUR_OPTION_SHORT_DESCRIPTION")
	@LazyCollection(LazyCollectionOption.FALSE)
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name="value",length = 2000)
	private Map<EnumLanguage, String> shortDescriptionLanguage;
	
	
	
	
	public Map<EnumLanguage, String> getShortDescriptionLanguage() {
		return shortDescriptionLanguage;
	}

	public void setShortDescriptionLanguage(Map<EnumLanguage, String> shortDescriptionLanguage) {
		this.shortDescriptionLanguage = shortDescriptionLanguage;
	}

	public String getName() {
		return name;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="tour_option_images", joinColumns=@JoinColumn(name="tour_option_id"))
	@Column(name="image_path")
	private List<String> images;

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
	
	
}
