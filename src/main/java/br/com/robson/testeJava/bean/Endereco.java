package br.com.robson.testeJava.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Endereco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3595892101965645956L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer numero;
	private String complemento;
	@OneToOne
	@JoinColumn(name="id_endereco_cep")
	private EnderecoCEP enderecoCEP;
	@Transient
	private String restMessage;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public EnderecoCEP getEnderecoCEP() {
		return enderecoCEP;
	}
	public void setEnderecoCEP(EnderecoCEP enderecoCEP) {
		this.enderecoCEP = enderecoCEP;
	}	
	public String getRestMessage() {
		return restMessage;
	}
	public void setRestMessage(String restMessage) {
		this.restMessage = restMessage;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", numero=" + numero + ", complemento=" + complemento + ", enderecoCEP="
				+ enderecoCEP + "]";
	}
	
	

}
