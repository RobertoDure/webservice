package br.com.alerta.rest.controller;

import java.util.List;

import br.com.alerta.rest.dao.AssaltoDAO;
import br.com.alerta.rest.dao.ItensAssaltosDAO;
import br.com.alerta.rest.model.Assalto;
import br.com.alerta.rest.model.Cidade;
import br.com.alerta.rest.model.ItemAssalto;

public class AssaltoController {

	
	public List<Assalto> listarAssaltos(){

		return AssaltoDAO.getInstance().listarAssaltos();
	}
	public List<Assalto> listarCidadeID(String idCidade){

		return AssaltoDAO.getInstance().listarAssaltosPorCidades(idCidade);
	}
	
}
