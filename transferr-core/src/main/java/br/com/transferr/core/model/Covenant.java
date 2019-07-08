package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.transferr.core.enums.EnumCategory;

@Entity
public class Covenant extends Entidade {

	private static final long serialVersionUID = -1172958666821708094L;
	@Column(length=180)
	private String description;
	@Enumerated(EnumType.STRING)
	private EnumCategory category;
	private String urlLogo;
	@Column(length=300)
	private String message;
	private boolean active;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EnumCategory getCategory() {
		return category;
	}
	public void setCategory(EnumCategory category) {
		this.category = category;
	}
	public String getUrlLogo() {
		return urlLogo;
	}
	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
