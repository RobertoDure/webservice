package br.com.alerta.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="assaltos_latlng")
@XmlRootElement
public class Assalto {
  
	@Id
	private String id_assalto;
	private String id_email;
	private String latitude;
	private String longitude;
	private String sexo_vitima;
	private String tipo_assalto;
	private String hora_assalto;
	private String data_assalto;
	private String idCidade;
	
	
	public String getId_assalto() {
		return id_assalto;
	}
	public void setId_assalto(String id_assalto) {
		this.id_assalto = id_assalto;
	}
	public String getId_email() {
		return id_email;
	}
	public void setId_email(String id_email) {
		this.id_email = id_email;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getSexo_vitima() {
		return sexo_vitima;
	}
	public void setSexo_vitima(String sexo_vitima) {
		this.sexo_vitima = sexo_vitima;
	}
	public String getTipo_assalto() {
		return tipo_assalto;
	}
	public void setTipo_assalto(String tipo_assalto) {
		this.tipo_assalto = tipo_assalto;
	}
	public String getHora_assalto() {
		return hora_assalto;
	}
	public void setHora_assalto(String hora_assalto) {
		this.hora_assalto = hora_assalto;
	}
	public String getData_assalto() {
		return data_assalto;
	}
	public void setData_assalto(String data_assalto) {
		this.data_assalto = data_assalto;
	}
	public String getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(String idCidade) {
		this.idCidade = idCidade;
	}
	
}
