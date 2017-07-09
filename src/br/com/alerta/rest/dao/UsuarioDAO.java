package br.com.alerta.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alerta.rest.model.Usuario;
import br.com.alerta.rest.util.UtilDAO;

public class UsuarioDAO extends UtilDAO {

	private static UsuarioDAO instance;
	ResultSet rs;
	public static UsuarioDAO getInstance(){
		if(instance == null)
			instance = new UsuarioDAO();
		return instance;
	}



public List<Usuario> buscarUsuario(String getemail) throws SQLException {
		
		List<Usuario> lista = new ArrayList<Usuario>();
		conectar();
		try {
			rs = executeQuery("SELECT * FROM usuarios where email='"
					+getemail+ "'"); 
		
				while (rs.next()) {
					Usuario usuario = new Usuario();
					usuario.setId(Integer.parseInt(rs.getString("id")));
					usuario.setEmail(rs.getString("email"));
					lista.add(usuario);
					fechar();
				}
						
			}catch (Exception e) {
				// TODO: handle exception
			}
		
	
		return lista;
	}
	public Object inserirUsuario(String email) throws SQLException {
		
		conectar();
		String script ="INSERT INTO usuarios(email) values('"
				+email+ "')" ; 
		try {
			if(executeUpdate(script)){
				commit();
				fechar();
				return "1";
			}else{
				return "0";
			}
		}finally {
			fechar();
		}
		
		
	}
}