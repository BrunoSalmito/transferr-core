package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents the federal state of a country for example: (Florida)
 * @author idoctor
 *
 */
@Entity
@Table(name="sub_country")
public class SubCountry   extends Entidade {

	public SubCountry() {
	}
	
	private static final long serialVersionUID = 8583570399600470000L;

	@ManyToOne
	@JoinColumn(name = "ID_COUNTRY",referencedColumnName="ID",nullable=true)
	private Country country;
	
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
}