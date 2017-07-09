package br.com.alerta.rest.controller;

import java.util.List;

import br.com.alerta.rest.dao.CidadeDAO;
import br.com.alerta.rest.model.Cidade;

public class CidadeController {

	
	public List<Cidade> listarCidadeID(String id){

		return CidadeDAO.getInstance().cidadePorEstado(id);
	}
}
