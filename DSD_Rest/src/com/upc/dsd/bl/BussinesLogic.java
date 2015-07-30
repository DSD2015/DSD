package com.upc.dsd.bl;

import java.util.List;

import com.upc.dsd.dao.DAOFactory;
import com.upc.dsd.interfaces.TrabajadorDAO;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;

public class BussinesLogic {

	static DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	/*
	 * final String FORMATO_FECHA = "MMM, dd yyyy"; final DateFormat DF = new
	 * SimpleDateFormat(FORMATO_FECHA); final Gson gson = new
	 * GsonBuilder().setDateFormat(FORMATO_FECHA).create();
	 */
	static TrabajadorDAO objTrabajadorDAO = fabrica
			.getTrabajadorDAO();

	public static List<Trabajador> obtenerTrabajadoresxEstado(String dni, int estado){
		return objTrabajadorDAO.consultarTrabajadorxEstado(dni, estado);
	}
	public static List<Trabajador> obtenerTrabajadoresxProyecto(String dni, String ruc){
		return objTrabajadorDAO.consultarTrabajadorxProyecto(dni, ruc);
	}
	public static List<Perfil> obtenerPerfiles(){
		return objTrabajadorDAO.consultarPerfil();
	}
	/*public static Datos obtenerDatosJSON(String user, String token, int of_Id)
			throws NoSuchAlgorithmException {

		Oficial oficial = null;
		Datos datos = new Datos();
		try {
			oficial = objOficialDAO.logIn(new Oficial(user, token, of_Id));
		} catch (Exception e) {

		}
		if (oficial != null) {
			datos.setMsg("01");
			List<Oficial> oficiales = new ArrayList<Oficial>();
			if (oficial.getLevel_id() == 1) {
				oficiales.add(oficial);
			} else {
				oficiales.add(oficial);
				oficiales.addAll(objOficialDAO.oficiales());
			}
			datos.setUsuariosList(oficiales);
			datos.setClientesList(new ArrayList<Cliente>());
			datos.setGruposList(new ArrayList<Cliente>());
			datos.setCuentasList(new ArrayList<Cuenta>());
			datos.setInstanciasList(new ArrayList<Instancia>());
			datos.setRespuestasList(new ArrayList<Respuestas>());
			for (Oficial ofic : oficiales) {
				datos.getClientesList().addAll(
						objClienteDAO.clientesPorOficial(ofic));
				datos.getGruposList().addAll(
						objClienteDAO.gruposPorOficial(ofic));
				datos.getCuentasList().addAll(
						objCuentaDao.cuentasxOficial(ofic.getId()));
				datos.getInstanciasList().addAll(
						objInstanciaDAO.getInstancias(ofic));
				datos.getRespuestasList().addAll(
						objRespuestasDAO.getRespuestas(ofic));
			}
			datos.setCuestionariosList(objCuestionarioDAO.getCuestionarios());
			datos.setSeccionesList(objSeccionDAO.getSections());
			datos.setPreguntasList(objPreguntasDAO.getPreguntas());
			datos.setOpcionesList(objOpcionesDAO.getOpciones());
			datos.setCuestSeccList(objCuestionarioSeccionDAO
					.getCuestionarioSeccions());
			datos.setSeccPregList(objSeccPregDAO.getSeccionPreguntas());
			datos.setPregOpcList(objPregOpcDAO.getPreguntasOpciones());
			token = generarToken(oficial, oficial.getPassword());
			oficial.setToken(token);
			objOficialDAO.insertToken(oficial);
			datos.setToken(token);
		} else {
			datos = null;
		}

		return datos;
	}

	public static void guardarDatos(String instancias, String respuestas) {
		Type type = new TypeToken<HashMap<String, Instancia[]>>() {
		}.getType();
		Type type2 = new TypeToken<HashMap<String, Respuestas[]>>() {
		}.getType();
		HashMap<String, Instancia[]> instanciasList = new HashMap<String, Instancia[]>();
		HashMap<String, Respuestas[]> respuestasList = new HashMap<String, Respuestas[]>();

		Gson gson = new Gson();
		instanciasList = gson.fromJson(instancias, type);
		respuestasList = gson.fromJson(respuestas, type2);
		Iterator<?> itI = instanciasList.entrySet().iterator();
		Iterator<?> itR = respuestasList.entrySet().iterator();

		while (itI.hasNext()) {

			Map.Entry e = (Map.Entry) itI.next();
			Instancia[] inst = (Instancia[]) e.getValue();
			for (int i = 0; i < inst.length; i++) {
				int oldInstId = inst[i].getId();
				int newInstId = objInstanciaDAO.insertInstancia(inst[i]);
				System.out.println("antes: " + oldInstId);
				System.out.println("ahora: " + newInstId);
				while (itR.hasNext()) {
					Map.Entry e2 = (Map.Entry) itR.next();
					Respuestas[] resp = (Respuestas[]) e2.getValue();
					for (int j = 0; j < resp.length; j++) {
						if (resp[j].getInstancia_id() == oldInstId) {
							resp[j].setInstancia_id(newInstId);
							objRespuestasDAO.insertRespuesta(resp[j]);
						}
					}
				}
			}
		}
	}
	
	public static void guardarDatos(Instancia[] instancias, Respuestas[] respuestas) {		
		for (Instancia inst: instancias){
			int oldInstId = inst.getId();
			int newInstId = objInstanciaDAO.insertInstancia(inst);
			System.out.println("antes: " + oldInstId);
			System.out.println("ahora: " + newInstId);
			for (Respuestas resp: respuestas){
				if (resp.getInstancia_id() == oldInstId) {
					resp.setInstancia_id(newInstId);
					objRespuestasDAO.insertRespuesta(resp);
				}
			}
		}
	}

	private static String generarToken(Oficial oficial, String password)
			throws NoSuchAlgorithmException {
		String cadena = oficial.getNombre() + password
				+ (new Date()).toString();
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(cadena.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		cadena = bigInt.toString(16);
		return cadena;
	}

	public static boolean validarToken(String user, String token, int of_Id) {
		boolean valido = true;

		if (objOficialDAO.logIn(new Oficial(user, token, of_Id)) == null) {
			valido = false;
		}
		return valido;
	}*/
}
