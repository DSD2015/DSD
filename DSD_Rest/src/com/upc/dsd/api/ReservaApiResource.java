package com.upc.dsd.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import com.upc.dsd.bl.BussinesLogic;
import com.upc.dsd.structures.Reserva;

@Path("/reserva")
public class ReservaApiResource {

	@POST
	@Path("/crear")
	@Produces({ MediaType.APPLICATION_JSON })
	public Reserva generarReserva(Reserva reserva) throws WebApplicationException {
		try {
			reserva = BussinesLogic.crearReserva(reserva);
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(404);
		}

		return reserva;
	}
}
