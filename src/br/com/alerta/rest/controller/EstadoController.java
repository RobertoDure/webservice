package br.com.alerta.rest.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.alerta.rest.dao.EstadoDAO;
import br.com.alerta.rest.model.Estado;

public class EstadoController {

	
	public List<Estado> listarEstados(){

		return EstadoDAO.getInstance().listarEstados();
	}
	
	public List<Estado> listarEstadoID(String id){

		return EstadoDAO.getInstance().estadosID(id);
	}
	
}
