package br.com.alerta.rest.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilDAO {

	
	  private Connection    connection;

	    private Statement     statement;

	    protected void conectar() {

	       
	        try {
	            connection = ConnectionFactory.getConnection();
	            connection.setAutoCommit(false);
	            statement = connection.createStatement();
	        } catch (ClassNotFoundException e) {
	         
	        } catch (SQLException e) {
	           
	        } catch (IOException e) {
	          
	        }
	    }
	    protected ResultSet executeQuery(String script) {

	      
	        ResultSet rs = null;
	        try {
	            if (statement == null) {
	                statement = connection.createStatement();
	            }
	             rs = statement.executeQuery(script);
	        } catch (SQLException e) {
	          
	          
	            return null;
	        }
	        
	        return rs;
	    }

	    protected boolean executeUpdate(String script) {

	     
	        try {
	            statement.executeUpdate(script);
	            return true;
	        } catch (SQLException e) {
	           
	            e.printStackTrace();
	            return false;
	        }
	    }

	    protected boolean execute(String script) {

	    
	        try {
	            statement.execute(script);
	            return true;
	        } catch (SQLException e) {
	          
	            return false;
	        }
	    }
	    protected void fechar() {

	      
	        try {
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	           
	        }
	    }
	    protected void commit() {

	     
	        try {
	            connection.commit();
	        } catch (SQLException e) {
	         
	        }
	    }
	}


