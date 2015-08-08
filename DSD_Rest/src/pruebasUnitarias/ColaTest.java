package pruebasUnitarias;


import java.util.List;

import com.upc.dsd.api.TrabajadorApiResource;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ColaTest extends TestCase{
	
	
	public void testConcat()
	  {
		

		
		TrabajadorApiResource trabajador = new TrabajadorApiResource();
		
		Trabajador tra = new Trabajador();
		tra.setCodTrabajador(9);
		tra.setApeMat("sss");
		tra.setApePat("sss");
		tra.setEdad(20);
		tra.setEstado(1);
		tra.setNombre("");
		tra.setNombre("");
		
		Trabajador obj = trabajador.crearTrabajador(tra);
		
		Integer existeData = 0;
		
		if(obj != null  ){
			existeData = 1;
		}
		
		assertTrue( existeData.equals(1)   );
		
		
	  }
	
	

	  public static Test suite()
	  { 
	    return new TestSuite(ColaTest.class);
	  } // suite

	  public static void main (String[] args)
	  {
	    junit.textui.TestRunner.run(suite());
	  }
	
	
	
	
	
	
		

}
