package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import serviceImpl.UtilServiceImpl.Cliente;
import serviceImpl.UtilServiceImpl.Solicitud;
import serviceImpl.UtilServiceImpl.UtilService;
import serviceImpl.UtilServiceImpl.UtilServiceImplService;

/**
 * Servlet implementation class ServletSoli
 */
public class ServletSoli extends HttpServlet {
	private static final long serialVersionUID = 1L;



	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		String msj = "";
	
		
	      String metodo = request.getParameter("met");
	      
	      System.out.println("metodo -------"+metodo);
	      
	      if(metodo.equals("listarCliente")){
	    	  
	    	  
	    	  
	   	   try {
				UtilServiceImplService 	service 	= new UtilServiceImplService();
				UtilService 		serviImpl 	= service.getUtilServiceImplPort();
				
				
				ArrayList<Cliente>  
				listarCliente =  (ArrayList<Cliente>) serviImpl.listarClientes();
				
				System.out.println("listarCliente : "+ listarCliente.size() );
	   		
	   		
	   		
	   		request.getSession().setAttribute("lista", listarCliente);
	   		getServletContext().getRequestDispatcher("/registrarSolicitud.jsp").forward(request, response);	
	   		
			   	} catch (Exception e) {
			   		e.printStackTrace();
			   	}
	    	  
	    	  
	      }else if(metodo.equals("registrar")  ){
	    	  
	    	  System.out.println("-------registrar  -------");
	    	  
		   	   try {
					UtilServiceImplService 	service 	= new UtilServiceImplService();
					UtilService 		serviImpl 	= service.getUtilServiceImplPort();
					
					
					
					
					String selecCliente = (String)request.getParameter("selecCliente");
					String txtdesperfil = (String)request.getParameter("txtdesperfil");
					String txtdesproy 	= (String)request.getParameter("txtdesproy");
					String txtfecinicio = (String)request.getParameter("txtfecinicio");
					String txtfecfin 	= (String)request.getParameter("txtfecfin");
					
					
					
					System.out.println("selecCliente:"+selecCliente);
					System.out.println("txtdesperfil:"+txtdesperfil);
					System.out.println("txtdesproy:"+txtdesproy);
					System.out.println("txtfecinicio:"+txtfecinicio);
					System.out.println("txtfecfin:"+txtfecfin);
					

					if(selecCliente !=null ){
					

								Solicitud solicitud = new Solicitud();
								
								solicitud.setCodcli( Integer.parseInt( selecCliente.trim())) ;
								solicitud.setDesperfil(txtdesperfil.trim());
								solicitud.setDesproyecto(txtdesproy.trim());
								
								 Date date = new Date();
								 Date date2 = new Date();
								    DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
								     try {
								         date = dt.parse(txtfecinicio);//("2015-03-14");
								         
								         date2 = dt.parse (txtfecfin); //("2015-03-14");
								     } catch (Exception parseException) {
								    	 parseException.printStackTrace();
								     }
								     
								     
								     System.out.println("date:"+date);
								     System.out.println("date2:"+date2);
								     
								
								     XMLGregorianCalendar xml = toXMLGregorianCalendar(date); 
								     
								     XMLGregorianCalendar xml2 = toXMLGregorianCalendar(date2); 
								     
								     System.out.println("date xml:"+xml);
								     System.out.println("date2 xml2:"+xml2);
								
								solicitud.setFeFin( xml  ) ;
								solicitud.setFeInicio( xml2 );
								
								Integer flag = serviImpl.registrarSolicitud(solicitud);
								
								System.out.println("flag::"+flag);
					
					
					}
					
					
					
					ArrayList<Cliente>  
					listarCliente =  (ArrayList<Cliente>) serviImpl.listarClientes();
		   		    request.getSession().setAttribute("lista", listarCliente);
		   		
		   		
		   		    
		   		 request.getSession().setAttribute("msj", msj);
		   		    
		   		    
		   		getServletContext().getRequestDispatcher("/registrarSolicitud.jsp").forward(request, response);	
		   		
				   	} catch (Exception e) {
				   		e.printStackTrace();
				   	}
	    	  
	    	  
	    	  
	    	  
	      }
	      
	      
	      
	      
	      
	}
	
	
	
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
           ex.printStackTrace();
        }
        return xmlCalendar;
    }



	
	

}
