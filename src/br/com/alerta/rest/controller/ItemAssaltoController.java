package br.com.alerta.rest.controller;

import java.util.List;

import br.com.alerta.rest.dao.ItensAssaltosDAO;
import br.com.alerta.rest.model.ItemAssalto;

public class ItemAssaltoController {

	
	public List<ItemAssalto> listarItemAssalto(String idAssalto){

		return ItensAssaltosDAO.getInstance().listarItensAssalto(idAssalto);
	}
}
