package br.com.transferr.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name=Parametros.FIND_BY_CHAVE,query="FROM Parametros WHERE chave = :chave")
})

@Entity
@Table(name="PARAMETERS",indexes=@Index(unique=true,columnList="chave"))
public class Parametros extends Entidade {

	public static final String FIND_BY_CHAVE = "br.com.idoctor.persistence.model.Parametros.findByChave";
	private static final long serialVersionUID = -2970061996454399614L;
	@Column(name="CHAVE",nullable=false)
	private int chave = 0;
	@Column(name="VALOR",nullable=false)
	private String valor = "";
	@Column(name="DESCRICAO",length=120)
	private String descricao = "";
	@Column(name="DETALHE")
	private String detalhe = "";
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	
	
	
}
