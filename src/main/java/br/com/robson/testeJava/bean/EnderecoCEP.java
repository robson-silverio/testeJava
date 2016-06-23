package br.com.robson.testeJava.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class EnderecoCEP implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1595448474275284771L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	@Transient
	private String restMessage;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}	
	public String getRestMessage() {
		return restMessage;
	}
	public void setRestMessage(String restMessage) {
		this.restMessage = restMessage;
	}
	
	@Override
	public String toString() {
		return "EnderecoCEP [id=" + id + ", cep=" + cep + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + "]";
	}
	
	
	
	
	
	
}
