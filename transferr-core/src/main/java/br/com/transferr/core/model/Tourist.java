package br.com.transferr.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.transferr.core.enums.EnumDeviceType;
@NamedQueries({
	@NamedQuery(name=Tourist.FIND_BY_EMAIL,query="FROM Touris WHERE email = :email")
})
@Entity
public class Tourist extends Entidade{

	public static final String FIND_BY_EMAIL = "br.com.transferr.core.model.Tourist.findByEmail";
	@Temporal(TemporalType.TIMESTAMP)
	private Date register;
	private String email;
	private String phone;
	@Enumerated(EnumType.STRING)	
	private EnumDeviceType device;
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public EnumDeviceType getDevice() {
		return device;
	}
	public void setDevice(EnumDeviceType device) {
		this.device = device;
	}
	
}
