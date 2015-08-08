package pruebasUnitarias;

import java.util.ArrayList;



import bean.Cliente;
import serviceImpl.UtilServiceImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ClienteTest extends TestCase{
	
	
	public void testConcat()
	  {
		
		UtilServiceImpl util = new UtilServiceImpl();
		
		
		ArrayList<Cliente> lista =util.listarClientes();
		
		Integer existeData = 0;
		
		if(lista.size()  >0){
			
			
			existeData = 1;
		}
		
		
		System.out.println("lista::"  +lista);
		
		assertTrue( existeData.equals(1)   );
		
		
	  }
	
	

	  public static Test suite()
	  { 
	    return new TestSuite(ClienteTest.class);
	  } // suite

	  public static void main (String[] args)
	  {
	    junit.textui.TestRunner.run(suite());
	  }
	
	
	
	
	
	
		

}
