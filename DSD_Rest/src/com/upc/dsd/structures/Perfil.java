package com.upc.dsd.structures;

public class Perfil {
	private int idPerfil;
	private String descripcion;
	
	public Perfil() {
		// TODO Auto-generated constructor stub
	}

	public Perfil(int idPerfil, String descripcion) {
		super();
		this.idPerfil = idPerfil;
		this.descripcion = descripcion;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
