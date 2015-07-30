package com.upc.dsd.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upc.dsd.interfaces.TrabajadorDAO;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.util.MySqlConexion;

public class MySqlTrabajadorDAO implements TrabajadorDAO {

	@Override
	public List<Trabajador> consultarTrabajadorxEstado(String dni, int estado) {
		Connection cn = MySqlConexion.obtenerConexion();
		List<Trabajador> list = new ArrayList<Trabajador>();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("SELECT * FROM RECURSO WHERE NRODOC = ? AND ESTADO = ?");
			
			pStmt.setString(1, dni);
			pStmt.setInt(2, estado);
			pStmt.execute();
			
			ResultSet rs = pStmt.getResultSet();
			
			while (rs.next()) {
				Trabajador objTrab = new Trabajador();
				objTrab.setCodTrabajador(rs.getInt("CODTRABAJADOR"));
				objTrab.setNombre(rs.getString("NOMBRE"));
				objTrab.setApePat(rs.getString("APEPAT"));
				objTrab.setApeMat(rs.getString("APEMAT"));
				objTrab.setEdad(rs.getInt("EDAD"));
				objTrab.setNroDoc(rs.getString("NRODOC"));
				objTrab.setEspecialidad(rs.getString("ESPECIALIDAD"));
				objTrab.setPerfil(rs.getInt("PERFIL"));
				objTrab.setEstado(rs.getInt("ESTADO"));
				list.add(objTrab);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Trabajador> consultarTrabajadorxProyecto(String dni, String ruc) {
		Connection cn = MySqlConexion.obtenerConexion();
		List<Trabajador> list = new ArrayList<Trabajador>();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("SELECT * FROM RECURSO WHERE NRODOC = ? AND ESTADO = ?");
			
			pStmt.setString(1, dni);
			pStmt.setString(2, ruc);
			pStmt.execute();
			
			ResultSet rs = pStmt.getResultSet();
			
			while (rs.next()) {
				Trabajador objTrab = new Trabajador();
				objTrab.setCodTrabajador(rs.getInt("CODTRABAJADOR"));
				objTrab.setNombre(rs.getString("NOMBRE"));
				objTrab.setApePat(rs.getString("APEPAT"));
				objTrab.setApeMat(rs.getString("APEMAT"));
				objTrab.setEdad(rs.getInt("EDAD"));
				objTrab.setNroDoc(rs.getString("NRODOC"));
				objTrab.setEspecialidad(rs.getString("ESPECIALIDAD"));
				objTrab.setPerfil(rs.getInt("PERFIL"));
				objTrab.setEstado(rs.getInt("ESTADO"));
				list.add(objTrab);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Perfil> consultarPerfil() {
		// TODO Auto-generated method stub
		return null;
	}

}
