package pruebasUnitarias;


import java.util.List;

import com.upc.dsd.api.TrabajadorApiResource;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TrabajadorTest extends TestCase{
	
	
	public void testConcat() throws Exception
	  {
		
		/*
		public static MyResource sut = new MyResource();
	    public static InMemoryRestServer server;
        Response response = server.newRequest("/myresource").request().buildPost(Entity.text("42")).invoke();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        MyModel myModel = response.readEntity(MyModel.class);
        assertEquals(42, myModel.getResult());/**/
		
		TrabajadorApiResource trabajador = new TrabajadorApiResource();
		
		List<Trabajador> obtenerTrabajadoresxEstado  = trabajador.obtenerTrabajadoresxEstado("", -1);
		
		Integer existeData = 0;
		
		if(obtenerTrabajadoresxEstado.size()>0  ){
			
			existeData = 1;
		}
		
		assertTrue( existeData.equals(1)   );
		
		
	  }
	
	

	  public static Test suite()
	  { 
	    return new TestSuite(TrabajadorTest.class);
	  } // suite

	  public static void main (String[] args)
	  {
	    junit.textui.TestRunner.run(suite());
	  }
	
	
	
	
	
	
		

}
