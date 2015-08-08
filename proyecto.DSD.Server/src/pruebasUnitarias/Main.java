package pruebasUnitarias;

import java.sql.*;
import java.util.*;

import util.ConexionDB;
import util.ConexionDB2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		/*
		System.out.print("------------");
		jaxws3.ServicioWebIMPL ser = new jaxws3.ServicioWebIMPL();
		
		ArrayList lis =  ser.lista();
		Usuario usu = new Usuario();
		
		for(int i=0;i < lis.size();i++){
			
			((Usuario)lis.get(i)).getNom();
			
			System.out.print("lis :"+((Usuario)lis.get(i)).getNom());
		}
		
		System.out.print("lis :"+lis);
		/**/
		
		
		
        Connection miConexion;
        miConexion=ConexionDB.GetConnection();
     
        
        
        if(miConexion!=null)
        {
        	 try {
        	System.out.println("se conecto");
        	
        	Statement statement = (Statement) miConexion.createStatement();
            ResultSet   resultSet = (ResultSet) statement.executeQuery("select * from solicitud");
            int count = 0;
           
				while (resultSet.next()) {
				  count++;
				  
				  System.out.println("codigo : "+resultSet.getString(1));
				  System.out.println("nombres : "+resultSet.getString(2));
				  System.out.println("nombres : "+resultSet.getString(3));
				  
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}  
        	
        	
            //JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        
        System.out.println("-------------------------------");
        Connection miConexion2;
        miConexion2=ConexionDB2.GetConnection();
        
        if(miConexion2!=null)
        {
        	 try {
        	System.out.println("se conecto");
        	
        	Statement statement = (Statement) miConexion2.createStatement();
            ResultSet   resultSet = (ResultSet) statement.executeQuery("select * from cliente");
            int count = 0;
           
				while (resultSet.next()) {
				  count++;
				  
				  System.out.println("codigo : "+resultSet.getString(1));
				  System.out.println("nombres : "+resultSet.getString(2));
				  System.out.println("nombres : "+resultSet.getString(3));
				  
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}  
        	
        	
            //JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        
        
        /**/
		
	}

}
