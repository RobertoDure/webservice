package br.com.alerta.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="itens_assalto")
@XmlRootElement
public class ItemAssalto {
	
	@Id
	private String id_item;
	private String descricao;
	private String id_assalto;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getId_item() {
		return id_item;
	}
	public void setId_item(String id_item) {
		this.id_item = id_item;
	}
	public String getId_assalto() {
		return id_assalto;
	}
	public void setId_assalto(String id_assalto) {
		this.id_assalto = id_assalto;
	}

	

}
