package com.upc.dsd.structures;

public class Trabajador {
	
	private int codTrabajador;
	private String nombre;
	private String apePat;
	private String apeMat;
	private int edad;
	private String nroDoc;
	private String especialidad;
	private int perfil;
	private int estado;
	
	public Trabajador(){
		
	}
	public Trabajador(int codTrabajador, String nombre, String apePat, String apeMat, int edad, String nroDoc,
			String especialidad, int perfil, int estado) {
		super();
		this.codTrabajador = codTrabajador;
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.edad = edad;
		this.nroDoc = nroDoc;
		this.especialidad = especialidad;
		this.perfil = perfil;
		this.estado = estado;
	}
	public int getCodTrabajador() {
		return codTrabajador;
	}
	public void setCodTrabajador(int codTrabajador) {
		this.codTrabajador = codTrabajador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}
