package br.com.alerta.rest.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.alerta.rest.controller.UsuarioController;
import br.com.alerta.rest.model.Usuario;


@Path("/usuario")
public class UsuarioResource {
	
	    @GET
	    @Path("/emails")
		@Produces("application/json")
	    public List<Usuario> buscarUsuario(@QueryParam("getemail") String getemail) throws SQLException {
			
	    	     return new UsuarioController().buscarUsuario(getemail);
	      
				}
	    
	    @GET
		@Produces("application/json")
	    public Object inserirUsuario(@QueryParam("email") String email) throws SQLException {
			
	    	return new UsuarioController().inserirUsuario(email);
	              
				}
}
