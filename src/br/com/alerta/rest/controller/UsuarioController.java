package br.com.alerta.rest.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.alerta.rest.dao.UsuarioDAO;
import br.com.alerta.rest.model.Usuario;

public class UsuarioController {

	
	public List<Usuario> buscarUsuario(String getemail) throws SQLException{

		return UsuarioDAO.getInstance().buscarUsuario(getemail);
	   
   }
	public Object inserirUsuario(String email) throws SQLException{

		return UsuarioDAO.getInstance().inserirUsuario(email);
	   
   }
}
