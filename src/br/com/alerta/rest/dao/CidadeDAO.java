package br.com.alerta.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alerta.rest.model.Cidade;
import br.com.alerta.rest.util.UtilDAO;

public class CidadeDAO extends UtilDAO{
	
	private static CidadeDAO instance;



	public static CidadeDAO getInstance(){
		if(instance == null)
			instance = new CidadeDAO();
		return instance;
	}
	
	public List<Cidade> cidadePorEstado(String id) {

		conectar();
		List<Cidade> lista = new ArrayList<Cidade>();
		try {
			ResultSet rs = executeQuery("select * from cidade where idEstado="+id);
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				Cidade cidade = new Cidade();
				cidade.setId(rs.getString("Id"));
				cidade.setIdEstado(rs.getString("IdEstado"));
				cidade.setNome(rs.getString("Nome"));
				cidade.setUf(rs.getString("Uf"));
				cidade.setCodigoMunicipio(rs.getString("CodigoMunicipio"));
				lista.add(cidade);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}

}
