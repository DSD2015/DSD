package com.upc.dsd.util;

import java.sql.*;

public class MySqlConexionClient {

	static{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection obtenerConexion(){
		
		Connection cn = null;
		
		try {
			
			cn = 
				DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/proyectodsdquickwin?noAccessToProcedureBodies=true",
						"root",
						"");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cn;
	}
	
}
