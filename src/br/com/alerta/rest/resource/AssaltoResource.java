package br.com.alerta.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.alerta.rest.controller.AssaltoController;
import br.com.alerta.rest.controller.EstadoController;
import br.com.alerta.rest.controller.ItemAssaltoController;
import br.com.alerta.rest.model.Assalto;
import br.com.alerta.rest.model.Estado;
import br.com.alerta.rest.model.ItemAssalto;


@Path("/assaltos")
public class AssaltoResource {

	@GET
	@Produces("application/json")
	public List<Assalto> listarTodos(){
		return new AssaltoController().listarAssaltos();
	}
	
	@GET
	@Path("{idCidade}")
	@Produces("application/json")
	public List<Assalto> listarAssaltoPorCidade(@PathParam("idCidade") String idCidade){
		return new AssaltoController().listarCidadeID(idCidade);
	}

}
