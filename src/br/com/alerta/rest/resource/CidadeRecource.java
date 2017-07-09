package br.com.alerta.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.alerta.rest.controller.CidadeController;
import br.com.alerta.rest.model.Cidade;


@Path("/cidade")
public class CidadeRecource {
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public List<Cidade> listarCidadeID(@PathParam("id") String id){
		return new CidadeController().listarCidadeID(id);
	}	

}
