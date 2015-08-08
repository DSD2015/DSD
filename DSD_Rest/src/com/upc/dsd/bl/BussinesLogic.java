package com.upc.dsd.bl;

import java.util.List;

import com.upc.dsd.dao.DAOFactory;
import com.upc.dsd.interfaces.ReservaDAO;
import com.upc.dsd.interfaces.TrabajadorDAO;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Reserva;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.structures.TrabajadorProyecto;

public class BussinesLogic {

	static DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	/*
	 * final String FORMATO_FECHA = "MMM, dd yyyy"; final DateFormat DF = new
	 * SimpleDateFormat(FORMATO_FECHA); final Gson gson = new
	 * GsonBuilder().setDateFormat(FORMATO_FECHA).create();
	 */
	static TrabajadorDAO objTrabajadorDAO = fabrica
			.getTrabajadorDAO();
	static ReservaDAO objReservaDAO = fabrica
			.getReservaDAO();

	public static List<Trabajador> obtenerTrabajadoresxEstado(String dni, int estado) throws Exception{
		return objTrabajadorDAO.consultarTrabajadorxEstado(dni, estado);
	}
	public static List<TrabajadorProyecto> obtenerTrabajadoresxProyecto(String dni, String ruc) throws Exception{
		return objTrabajadorDAO.consultarTrabajadorxProyecto(dni, ruc);
	}
	public static List<Trabajador> obtenerTrabajadoresxFecha(String fec_in, String fec_fin, int perfil, int estado) throws Exception{
		return objTrabajadorDAO.consultarTrabajadorxFecha(fec_in, fec_fin, perfil, estado);
	}
	public static void actualizarTrabajador(Trabajador trabajador) throws Exception {
		objTrabajadorDAO.actualizarTrabajador(trabajador);
	}
	public static Trabajador crearTrabajador(Trabajador trabajador) throws Exception {
		return objTrabajadorDAO.crearTrabajador(trabajador);
	}
	public static List<Perfil> obtenerPerfiles() throws Exception{
		return objTrabajadorDAO.consultarPerfil();
	}
	public static Reserva crearReserva(Reserva reserva) throws Exception{
		return objReservaDAO.crearReserva(reserva);
	}
}
