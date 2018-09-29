package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import br.com.transferr.core.enums.EnumLanguage;

@Entity
@Table(name="text_language")
public class TextLanguage extends Entidade {

	private static final long serialVersionUID = -2165874679626914848L;

	
	@Column(length = 3000 ,name = "description",nullable=false)
	private String desc;
	
	@Column(name="language",nullable=false)
	@Enumerated(EnumType.STRING)
	private EnumLanguage language;
	
	@Column(name = "cod",nullable=false)
	private Integer cod;
	
	
	@NaturalId
	@Column(name = "key_id",nullable=false)
	private Long keyId;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public EnumLanguage getLanguage() {
		return language;
	}
	public void setLanguage(EnumLanguage language) {
		this.language = language;
	}
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public Long getKeyId() {
		return keyId;
	}
	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}
	
	
	
	
	
	
	
}
