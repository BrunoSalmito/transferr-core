package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Group")
public class Group   extends Entidade{

	@Column(name = "name")
	public String name;
	@Column(name = "stateID")
	public String stateID;
	@Column(name = "telephone_principal")
	public Integer telephone;
	@Column(name = "code_principal")
	public Integer codeTelephone;
	
	@OneToMany
	@JoinColumn(name = "ID_LOCATION",referencedColumnName="ID",nullable=true)
	public Location location;
	
	
	
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
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public Integer getCodeTelephone() {
		return codeTelephone;
	}
	public void setCodeTelephone(Integer codeTelephone) {
		this.codeTelephone = codeTelephone;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	} 
	
}
