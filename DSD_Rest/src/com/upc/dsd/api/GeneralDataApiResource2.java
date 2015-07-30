package com.upc.dsd.api;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.upc.dsd.bl.BussinesLogic;

//@Path("/sync")
public class GeneralDataApiResource2 {

	/*@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Datos SynchronizeData2(@QueryParam("username") final String user,
			@QueryParam("token") final String token,
			@QueryParam("ofId") final int of_Id,
			final String apiRequestBodyAsJson) {

		/*Datos datosJSON = null;

		if (!BussinesLogic.validarToken(user, token, of_Id)) {
			try {
				datosJSON = new Datos();
				datosJSON.setMsg("00");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			Type type = new TypeToken<Synchronization>() {
			}.getType();
			Gson gson = new Gson();
			Synchronization syncData = gson
					.fromJson(apiRequestBodyAsJson, type);
			Instancia[] instancias = syncData.getInstancia();
			Respuestas[] respuestas = syncData.getRespuestas();

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
