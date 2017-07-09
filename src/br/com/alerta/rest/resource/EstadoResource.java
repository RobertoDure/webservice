package br.com.alerta.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.alerta.rest.controller.EstadoController;
import br.com.alerta.rest.model.Estado;

@Path("/estados")
public class EstadoResource {

	@GET
	@Produces("application/json")
	public List<Estado> listarTodos(){
		return new EstadoController().listarEstados();
	}
	
	@GET
	@Path("{estadoID}")
	@Produces("application/json")
	public List<Estado> listarEstadoID(@PathParam("estadoID") String id){
		return new EstadoController().listarEstadoID(id);
	}
}
