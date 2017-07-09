package br.com.alerta.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alerta.rest.model.Assalto;
import br.com.alerta.rest.model.ItemAssalto;
import br.com.alerta.rest.util.UtilDAO;

public class ItensAssaltosDAO extends UtilDAO {

	
	private static ItensAssaltosDAO instance;

	public static ItensAssaltosDAO getInstance(){
		if(instance == null)
			instance = new ItensAssaltosDAO();
		return instance;
	}
	
	public List<ItemAssalto> listarItensAssalto(String idAssalto) {

		conectar();
		List<ItemAssalto> lista = new ArrayList<ItemAssalto>();
		try {
			ResultSet rs = executeQuery("select * from itens_assalto where id_assalto="+idAssalto);
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				ItemAssalto iten_assalto = new ItemAssalto();
				iten_assalto.setId_item(String.valueOf(rs.getInt("id_item")));
				iten_assalto.setId_assalto(String.valueOf(rs.getInt("id_assalto")));
				iten_assalto.setDescricao(rs.getString("descricao"));
	
				lista.add(iten_assalto);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}
	
}
