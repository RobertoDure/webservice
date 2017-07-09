package br.com.alerta.rest.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		/*
		 *  1 = Teste
		 *  0 = Produçao
		 */
		String bd = "1";
		if(bd.equals("1")){
			Class.forName(DRIVER);
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/alerta","root","root");  
		}else{
			Class.forName(DRIVER);
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/robertodure_alerta","rober_dure","dure7623786");  
		}


	}
}