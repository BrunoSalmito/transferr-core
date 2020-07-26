package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GROUPING")
public class Grouping   extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1483850633945779688L;
	@Column(name = "name")
	private String name;
	@Column(name = "stateID")
	private String stateID;
	@Column(name = "telephone_principal")
	private Long telephone;
	@Column(name = "code_principal")
	private Long codeTelephone;
	
	@ManyToOne
	@JoinColumn(name = "ID_LOCATION",referencedColumnName="ID",nullable=true)
	private Location location;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateID() {
		return stateID;
	}
	public void setStateID(String stateID) {
		this.stateID = stateID;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public Long getCodeTelephone() {
		return codeTelephone;
	}
	public void setCodeTelephone(Long codeTelephone) {
		this.codeTelephone = codeTelephone;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	} 
	
}
