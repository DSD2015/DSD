package serviceImpl;

import java.sql.*;
import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class UtilServiceImpl implements UtilService{

	
	
	@Override
	@WebMethod
	public Integer registrarSolicitud(Solicitud solicitud) {
		
		
		Connection miConexion=null;
		Integer flag =0;
		PreparedStatement pst = null;
		try {
			
	        miConexion=ConexionDB.GetConnection();
			
			String sql = " INSERT INTO solicitud "
					+ "( De_Proyecto, De_Perfil, Es_Solicitud, Fe_Inicio,Fe_Fin, Fe_Creacion, Co_Cliente)  "
					+ " VALUES ("
					+ "?,"
					+ "?,"
					+ "'A',"
					+ " ?, "
					+ " ?, "
					+ " sysdate(), "
					+ " ? )  ";
			
			    System.out.println(sql);
				
				pst = miConexion.prepareStatement(sql);
					
					pst.setString(1,  solicitud.getDesproyecto());
					pst.setString(2,  solicitud.getDesperfil());
					//pst.setString(3,  "A");
					pst.setDate(  3,  new java.sql.Date( solicitud.getFeInicio().getTime() ) );
					pst.setDate(  4,  new java.sql.Date( solicitud.getFeFin().getTime() )   ) ;
					//pst.setDate(  6,  new java.sql.Date(solicitud.getFecCreacion().getTime() )  );
					pst.setInt(   5,  solicitud.getCodcli()  );
					
					flag =pst.executeUpdate();
					
					
					if(flag==1){
						System.out.println("Se registro ok");
					}
					System.out.println(pst);
			
		} catch (Exception e) {
			flag =0;
			System.out.println(e);
			e.printStackTrace();
			
		} finally{
			try {
				if(pst!= null) pst.close();
				if(miConexion!= null) miConexion.close();
			} catch (SQLException e) {
				flag =0;
				e.printStackTrace();
			}
		}
		
		return flag;
	}

	
	
	@Override
	@WebMethod
	public ArrayList<Cliente> listarClientes() {
		
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Connection miConexion=null;
        miConexion=ConexionDB2.GetConnection();
        
        Cliente cli = null;
     
        if(miConexion!=null)
        {
        	 try {
        	
        	Statement statement =  (Statement) miConexion.createStatement();
            ResultSet   resultSet = (ResultSet) statement.executeQuery(" select * from cliente ");
                      
				while (resultSet.next()) {
					
				  cli = new Cliente();	
				  cli.setCodcliete(  		new Integer(  resultSet.getString(1)) 	);
				  cli.setRazonsocial( 		resultSet.getString(2) 					);
				  cli.setEstado(    		resultSet.getString(3) 					);
				  
				  lista.add( cli );
				  
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					miConexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}  
        	
        }
		
		return lista;
	}

}
