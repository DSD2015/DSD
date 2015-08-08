package pruebasUnitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



import bean.Solicitud;
import serviceImpl.UtilServiceImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolicitudTest extends TestCase{
	
	
	public void testConcat()
	  {
		
		UtilServiceImpl util = new UtilServiceImpl();
		
		Solicitud solicitud = new Solicitud();
		
		solicitud.setCodcli(9);
		solicitud.setDesperfil("test");
		solicitud.setDesproyecto("test proyecto");
		solicitud.setEstsolicitud("A");
		solicitud.setFecCreacion(new Date());
		 Date date = new Date();
		 DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
	     try {
	         date = dt.parse("2015-03-14");
	     } catch (ParseException parseException) {
	     }

		solicitud.setFeFin( date);
		solicitud.setFeInicio(date);
		
		
		Integer registrarSolicitud = 0;
		
		registrarSolicitud = util.registrarSolicitud(solicitud);
		
		System.out.println("registrarSolicitud::"  +registrarSolicitud);
		
		assertTrue(registrarSolicitud.equals(1));
		
	  }
	
	
	  public static Test suite()
	  { 
	    return new TestSuite(SolicitudTest.class);
	  } // suite

	  public static void main (String[] args)
	  {
	    junit.textui.TestRunner.run(suite());
	  }
	

}
