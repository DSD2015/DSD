package com.upc.dsd.interfaces;

import java.util.List;

import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.structures.TrabajadorProyecto;

public interface TrabajadorDAO {
	public List<Trabajador> consultarTrabajadorxEstado(String dni, int estado) throws Exception;
	public List<TrabajadorProyecto> consultarTrabajadorxProyecto(String dni, String ruc) throws Exception;
	public List<Trabajador> consultarTrabajadorxFecha(String fec_in, String fec_fin, int perfil, int estado) throws Exception;
	public List<Perfil> consultarPerfil() throws Exception;
	public void actualizarTrabajador (Trabajador trabajador) throws Exception;
	public Trabajador crearTrabajador (Trabajador trabajador) throws Exception;
}
