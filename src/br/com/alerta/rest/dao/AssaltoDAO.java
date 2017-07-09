package br.com.alerta.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alerta.rest.model.Assalto;
import br.com.alerta.rest.model.Cidade;
import br.com.alerta.rest.model.ItemAssalto;
import br.com.alerta.rest.util.UtilDAO;

public class AssaltoDAO extends UtilDAO {

	
	private static AssaltoDAO instance;

	public static AssaltoDAO getInstance(){
		if(instance == null)
			instance = new AssaltoDAO();
		return instance;
	}
	
	public List<Assalto> listarAssaltos() {

		conectar();
		List<Assalto> lista = new ArrayList<Assalto>();
		try {
			ResultSet rs = executeQuery("select * from assaltos_latlng");
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				Assalto assalto = new Assalto();
				assalto.setId_assalto(rs.getString("id_assalto"));
				assalto.setId_email(rs.getString("id_email"));
				assalto.setLatitude(rs.getString("latitude"));
				assalto.setLongitude(rs.getString("longitude"));
				assalto.setSexo_vitima(rs.getString("sexo_vitima"));
				assalto.setTipo_assalto(rs.getString("tipo_assalto"));
				assalto.setHora_assalto(rs.getString("hora_assalto"));
				assalto.setData_assalto(rs.getString("data_assalto"));
				assalto.setIdCidade(rs.getString("idCidade"));
				lista.add(assalto);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}
	
	public List<Assalto> listarAssaltosPorCidades(String idCidade) {

		conectar();
		List<Assalto> lista = new ArrayList<Assalto>();
		try {
			ResultSet rs = executeQuery("select * from assaltos_latlng where idCidade="+idCidade);
			if (rs == null){
				return null;
			}
			while (rs.next()) {
				Assalto assalto = new Assalto();
				assalto.setId_assalto(rs.getString("id_assalto"));
				assalto.setId_email(rs.getString("id_email"));
				assalto.setLatitude(rs.getString("latitude"));
				assalto.setLongitude(rs.getString("longitude"));
				assalto.setSexo_vitima(rs.getString("sexo_vitima"));
				assalto.setTipo_assalto(rs.getString("tipo_assalto"));
				assalto.setHora_assalto(rs.getString("hora_assalto"));
				assalto.setData_assalto(rs.getString("data_assalto"));
				assalto.setIdCidade(rs.getString("idCidade"));
				lista.add(assalto);
			}
		} catch (SQLException e) {

			return null;
		}finally {
			fechar();
		}
		return lista;

	}
	
}
