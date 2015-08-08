package servlet;

import java.util.ArrayList;
import java.util.List;

import serviceImpl.UtilServiceImpl.Cliente;
import serviceImpl.UtilServiceImpl.UtilService;
import serviceImpl.UtilServiceImpl.UtilServiceImplService;




public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			UtilServiceImplService 	service 	= new UtilServiceImplService();
			UtilService 		serviImpl 	= service.getUtilServiceImplPort();
			
			
			List<Cliente>  
			listarCliente =   serviImpl.listarClientes();
		
			
			System.out.println("listarCliente : "+ listarCliente );
			System.out.println("listarCliente : "+ listarCliente.size() );
			
			
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

	}

}
