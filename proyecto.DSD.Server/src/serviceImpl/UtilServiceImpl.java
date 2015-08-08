package serviceImpl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerService;
/**/
import javax.jws.WebService;
import util.ConexionDB;
import util.ConexionDB2;
import bean.Cliente;
import bean.Solicitud;


@WebService(endpointInterface="serviceImpl.UtilService")
public class UtilServiceImpl implements UtilService{

	
	
	@Override
	public Integer registrarSolicitud(Solicitud solicitud) {
		
		
		Connection miConexion=null;
		Integer flag =0;
		PreparedStatement pst = null;
		try {
			
	        miConexion=ConexionDB.GetConnection();
	        
	        if( miConexion!=null ){
	        
			
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
					
					
	        }else{
	        	/*
	        	System.out.println("-----------MQ-----------");
	        	crearBroker();
	        	
	        	
	        	System.out.println("-----------EN COLAR-----------");
	        	ConnectionFactory fabrica = new ActiveMQConnectionFactory("tcp://localhost:61616");
	        	Connection conexion = (Connection) fabrica.createConnection();
	        	((BrokerService) conexion).start();
	        	
	        	//2 Iniciar una sesion JMS
	        	// false para que se auto-commit
	        	//sesion.commit();
	        	Session sesion = ((javax.jms.Connection) conexion).createSession(false, Session.AUTO_ACKNOWLEDGE);
	        	
	        	//3 Crear o referencia la colaJMS
	        	Destination colaJMS = sesion.createQueue("colaBeans");
	        	
	        	//Creamos el productor de mensajes
	        	MessageProducer productor = sesion.createProducer(colaJMS);
	        	
	        	
	        	
	        	ObjectMessage mensaje = sesion.createObjectMessage((Serializable) solicitud);
	        	productor.send(mensaje);
	        	
	        	System.out.println("Bean Solicitud enviado");
	        	
	        	productor.close();
	        	sesion.close();
	        	conexion.close();
	        	System.out.println("-----------EN COLAR-----------");
	        	
	        	System.out.println("-----------MQ-----------");
	        	/**/
	        }
			
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
	
	
	
	/*
	void crearBroker(){
		
		try {
		BrokerService broker = new BrokerService();
		
			broker.setUseJmx(true);
			broker.addConnector("tcp://localhost:61616");
			
			broker.start();
			System.out.println("Broker JMS Iniciado OK");
			while(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}/**/
	

}
