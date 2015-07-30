package com.upc.dsd.interfaces;

import java.util.List;

import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;

public interface TrabajadorDAO {
	public List<Trabajador> consultarTrabajadorxEstado(String dni, int estado);
	public List<Trabajador> consultarTrabajadorxProyecto(String dni, String ruc);
	public List<Perfil> consultarPerfil();
}
