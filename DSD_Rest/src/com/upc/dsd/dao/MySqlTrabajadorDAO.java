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
			PreparedStatement pStmt = cn.prepareStatement("SELECT * FROM RECURSO WHERE NRODOC LIKE ? AND ESTADO = ?");
			
			pStmt.setString(1, "%" + dni + "%");
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
			PreparedStatement pStmt = cn.prepareStatement("SELECT rec.* FROM Solicitud soc"+
				" join Reserva res on soc.Co_Solicitud = res.Co_Solicitud" +
				" join Recurso rec on res.Co_Trabajador = rec.codtrabajador" +
				" where rec.NRODOC like ? and soc.co_cliente like ?;");
			
			pStmt.setString(1, "%" + dni + "%");
			pStmt.setString(2, "%" + ruc + "%");
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
		Connection cn = MySqlConexion.obtenerConexion();
		List<Perfil> list = new ArrayList<Perfil>();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("SELECT * FROM Perfil;");

			pStmt.execute();
			
			ResultSet rs = pStmt.getResultSet();
			
			while (rs.next()) {
				Perfil objPerf = new Perfil();
				objPerf.setIdPerfil(rs.getInt("IDPERFIL"));
				objPerf.setDescripcion(rs.getString("DESCRIPCION"));
				list.add(objPerf);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

}
