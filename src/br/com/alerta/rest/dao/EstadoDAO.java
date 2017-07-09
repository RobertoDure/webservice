package br.com.alerta.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.alerta.rest.model.Estado;
import br.com.alerta.rest.model.Usuario;
import br.com.alerta.rest.util.UtilDAO;

public class EstadoDAO extends UtilDAO{

	private static EstadoDAO instance;



	public static EstadoDAO getInstance(){
		if(instance == null)
			instance = new EstadoDAO();
		return instance;
	}
	
		public List<Estado> listarEstados() {

		conectar();
		List<Estado> lista = new ArrayList<Estado>();
		try {
			ResultSet rs = executeQuery("select * from estado");
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				Estado estado = new Estado();
				estado.setId(rs.getString("Id"));
				estado.setCodigoUf(rs.getString("CodigoUf"));
				estado.setNome(rs.getString("Nome"));
				estado.setUf(rs.getString("Uf"));
				estado.setRegiao(rs.getString("Regiao"));
				lista.add(estado);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}
		
		public List<Estado> estadosID(String id) {

		conectar();
		List<Estado> lista = new ArrayList<Estado>();
		try {
			ResultSet rs = executeQuery("select * from estado where Id="+id);
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				Estado estado = new Estado();
				estado.setId(rs.getString("Id"));
				estado.setCodigoUf(rs.getString("CodigoUf"));
				estado.setNome(rs.getString("Nome"));
				estado.setUf(rs.getString("Uf"));
				estado.setRegiao(rs.getString("Regiao"));
				lista.add(estado);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}
}
