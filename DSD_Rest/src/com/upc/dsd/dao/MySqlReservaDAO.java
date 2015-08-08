package com.upc.dsd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.upc.dsd.interfaces.ReservaDAO;
import com.upc.dsd.structures.Reserva;
import com.upc.dsd.util.MySqlConexion;

public class MySqlReservaDAO implements ReservaDAO {

	@Override
	public Reserva crearReserva(Reserva reserva) throws Exception {
		Connection cn = MySqlConexion.obtenerConexion();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("Insert into reserva " +
				" (co_solicitud, co_perfil, de_perfil, cn_perfil, co_trabajador, es_reserva, fe_inicio, fe_fin, fe_creacion)" +
				" values (?,?,?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
			pStmt.setInt(1, reserva.getCo_solicitud());
			pStmt.setInt(2, reserva.getCo_perfil());
			pStmt.setString(3, reserva.getDe_perfil());
			pStmt.setString(4, reserva.getCn_perfil());
			pStmt.setString(5, reserva.getCo_trabajador());
			pStmt.setString(6, reserva.getEs_reserva());
			pStmt.setString(7, reserva.getFe_inicio());
			pStmt.setString(8, reserva.getFe_fin());
			pStmt.setString(9, reserva.getFe_creacion());
			
			pStmt.executeUpdate();
			
			ResultSet rs = pStmt.getGeneratedKeys();
			
			while (rs.next()) {
				reserva.setCo_reserva(rs.getInt(1));
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		return reserva;
	}

}
