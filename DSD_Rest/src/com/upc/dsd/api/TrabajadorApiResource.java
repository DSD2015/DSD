package com.upc.dsd.api;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.upc.dsd.bl.BussinesLogic;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;

@Path("/trabajador")
public class TrabajadorApiResource {

	@GET
	@Path("/estado")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Trabajador> obtenerTrabajadoresxEstado(
			@QueryParam("dni") final String dni,
			@QueryParam("estado") final int estado) {

		List<Trabajador> trabajadores = null;
		try {
			trabajadores = BussinesLogic.obtenerTrabajadoresxEstado(dni, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return trabajadores;
	}
	
	@GET
	@Path("/proyecto")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Trabajador> obtenerTrabajadoresxProyecto(
			@QueryParam("dni") final String dni,
			@QueryParam("ruc") final String ruc) {

		List<Trabajador> trabajadores = null;
		try {
			trabajadores = BussinesLogic.obtenerTrabajadoresxProyecto(dni, ruc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return trabajadores;
	}
	
	@GET
	@Path("/perfil")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Perfil> obtenerPerfiles() {

		List<Perfil> perfiles = null;
		try {
			perfiles = BussinesLogic.obtenerPerfiles();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return perfiles;
	}
}
