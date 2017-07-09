package br.com.alerta.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estado {

	private String Id;
	private String CodigoUf;
	private String Nome;
	private String Uf;
	private String Regiao;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCodigoUf() {
		return CodigoUf;
	}
	public void setCodigoUf(String codigoUf) {
		CodigoUf = codigoUf;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getUf() {
		return Uf;
	}
	public void setUf(String uf) {
		Uf = uf;
	}
	public String getRegiao() {
		return Regiao;
	}
	public void setRegiao(String regiao) {
		Regiao = regiao;
	}
	
	
}
