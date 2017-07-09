package br.com.alerta.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.alerta.rest.controller.AssaltoController;
import br.com.alerta.rest.controller.ItemAssaltoController;
import br.com.alerta.rest.model.Assalto;
import br.com.alerta.rest.model.ItemAssalto;


@Path("/itemassalto")
public class ItemAssaltoResource {

	@GET
	@Path("{idAssalto}")
	@Produces("application/json")
	public List<ItemAssalto> listarItemAssalto(@PathParam("idAssalto") String idAssalto){
		return new ItemAssaltoController().listarItemAssalto(idAssalto);
	}
	
}
