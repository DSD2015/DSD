package com.upc.dsd.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.upc.dsd.bl.BussinesLogic;

//@Path("/data")
public class GeneralDataApiResource {

	/*@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Datos generalData(@QueryParam("username") final String user,
			@QueryParam("token") final String token,
			@QueryParam("ofId") final int of_Id) {

		/*Datos datos = null;
		try {
			datos = BussinesLogic.obtenerDatosJSON(user, token, of_Id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return datos;
		return null;
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public Datos SynchronizeData(
			@QueryParam("instancias") final String instancias,
			@QueryParam("respuestas") final String respuestas,
			@QueryParam("username") final String user,
			@QueryParam("token") final String token,
			@QueryParam("ofId") final int of_Id) {

		/*Datos datosJSON = null;
		if (!BussinesLogic.validarToken(user, token, of_Id)) {
			try {
				datosJSON = new Datos();
				datosJSON.setMsg("00");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			BussinesLogic.guardarDatos(instancias, respuestas);
			try {
				datosJSON = BussinesLogic.obtenerDatosJSON(user, token, of_Id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return datosJSON;
		return null;
	}*/

}
