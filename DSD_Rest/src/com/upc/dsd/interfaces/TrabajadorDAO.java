package com.upc.dsd.interfaces;

import java.util.List;

import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.structures.TrabajadorProyecto;

public interface TrabajadorDAO {
	public List<Trabajador> consultarTrabajadorxEstado(String dni, int estado);
	public List<TrabajadorProyecto> consultarTrabajadorxProyecto(String dni, String ruc);
	public List<Perfil> consultarPerfil();
}
