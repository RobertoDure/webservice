package br.com.alerta.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity 
@Table(name="cidade")
@XmlRootElement
public class Cidade {

	@Id
	private String Id;
	private String IdEstado;
	private String CodigoMunicipio;
	private String Uf;
	private String Nome;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getIdEstado() {
		return IdEstado;
	}
	public void setIdEstado(String idEstado) {
		IdEstado = idEstado;
	}
	public String getCodigoMunicipio() {
		return CodigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		CodigoMunicipio = codigoMunicipio;
	}
	public String getUf() {
		return Uf;
	}
	public void setUf(String uf) {
		Uf = uf;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
}
