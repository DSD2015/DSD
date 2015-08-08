package com.upc.dsd.api;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.upc.dsd.bl.BussinesLogic;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Reserva;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.structures.TrabajadorProyecto;

@Path("/trabajador")
public class TrabajadorApiResource {

	@GET
	@Path("/estado")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Trabajador> obtenerTrabajadoresxEstado(
			@QueryParam("dni") final String dni,
			@QueryParam("estado") final int estado) throws WebApplicationException{

		List<Trabajador> trabajadores = null;
		try {
			trabajadores = BussinesLogic.obtenerTrabajadoresxEstado(dni, estado);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}

		return trabajadores;
	}
	
	@GET
	@Path("/proyecto")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<TrabajadorProyecto> obtenerTrabajadoresxProyecto(
			@QueryParam("dni") final String dni,
			@QueryParam("ruc") final String ruc) throws WebApplicationException {

		List<TrabajadorProyecto> trabajadores = null;
		try {
			trabajadores = BussinesLogic.obtenerTrabajadoresxProyecto(dni, ruc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}

		return trabajadores;
	}
	
	@GET
	@Path("/fechas")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Trabajador> obtenerTrabajadoresxFecha(
			@QueryParam("fec_in") final String fec_in,
			@QueryParam("fec_fin") final String fec_fin,
			@QueryParam("perfil") final int perfil,
			@QueryParam("estado") final int estado) throws WebApplicationException {

		List<Trabajador> trabajadores = null;
		try {
			trabajadores = BussinesLogic.obtenerTrabajadoresxFecha(fec_in, fec_fin, perfil, estado);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}

		return trabajadores;
	}
	
	@GET
	@Path("/perfil")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Perfil> obtenerPerfiles() throws WebApplicationException {

		List<Perfil> perfiles = null;
		try {
			perfiles = BussinesLogic.obtenerPerfiles();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}

		return perfiles;
	}
	
	@POST
	@Path("/actualizar")
	@Produces({ MediaType.APPLICATION_JSON })
	public void actualizarTrabajador(Trabajador trabajador) throws WebApplicationException {
		try {
			BussinesLogic.actualizarTrabajador(trabajador);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}
	}
	@POST
	@Path("/crear")
	@Produces({ MediaType.APPLICATION_JSON })
	public Trabajador crearTrabajador(Trabajador trabajador) throws WebApplicationException {
		
		try {
			trabajador = BussinesLogic.crearTrabajador(trabajador);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}
		
		return trabajador;
	}
}
