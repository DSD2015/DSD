package servlet;

import java.util.ArrayList;

import utilserviceImple.UtilServiceImple.Cliente;
import utilserviceImple.UtilServiceImple.UtilServiceImpl;
import utilserviceImple.UtilServiceImple.UtilServiceImplService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			UtilServiceImplService 	service 	= new UtilServiceImplService();
			UtilServiceImpl 		serviImpl 	= service.getUtilServiceImplPort();
			
			
			ArrayList<utilserviceImple.UtilServiceImple.Cliente>  
			listarCliente =  (ArrayList<Cliente>) serviImpl.listarClientes();
			
			
			System.out.println("listarCliente : "+ listarCliente );
			
			System.out.println("listarCliente : "+ listarCliente.size() );
			
			
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

	}

}
