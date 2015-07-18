package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import serviceImpl.*;

public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		UtilServiceImpl util 
		= new UtilServiceImpl();
		
		
		/*
		ArrayList<Cliente> listarClientes 
		= util.listarClientes();
		
		System.out.println("listarClientes:: "+listarClientes);
		
		System.out.println("listarClientes:: "+listarClientes.size());
		/**/
		
		
		Solicitud solicitud = new Solicitud();
		
		solicitud.setCodcli(1);
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
		
		
		Integer registrarSolicitud = util.registrarSolicitud(solicitud);
		
		
		System.out.println("registrarSolicitud::"  +registrarSolicitud);
		
		
		
	}

}
