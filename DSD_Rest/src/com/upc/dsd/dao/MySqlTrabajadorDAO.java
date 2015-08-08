package com.upc.dsd.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.upc.dsd.interfaces.TrabajadorDAO;
import com.upc.dsd.structures.Perfil;
import com.upc.dsd.structures.Trabajador;
import com.upc.dsd.structures.TrabajadorProyecto;
import com.upc.dsd.util.MySqlConexion;

public class MySqlTrabajadorDAO implements TrabajadorDAO {

	@Override
	public List<Trabajador> consultarTrabajadorxEstado(String dni, int estado) throws Exception {
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
			throw e;
		}
		return list;
	}
	
	@Override
	public List<TrabajadorProyecto> consultarTrabajadorxProyecto(String dni, String ruc) throws Exception{
		Connection cn = MySqlConexion.obtenerConexion();
		List<TrabajadorProyecto> list = new ArrayList<TrabajadorProyecto>();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("SELECT distinct rec.*, soc.Co_cliente, cli.razonsocial, soc.De_proyecto" +
				" FROM Solicitud soc"+
				" join Reserva res on soc.Co_Solicitud = res.Co_Solicitud" +
				" join Recurso rec on res.Co_Trabajador = rec.codtrabajador" +
				" join Cliente cli on cli.codcliente = soc.co_cliente" +
				" where rec.NRODOC like ? and soc.co_cliente like ?;");
			
			pStmt.setString(1, "%" + dni + "%");
			pStmt.setString(2, "%" + ruc + "%");
			pStmt.execute();
			
			ResultSet rs = pStmt.getResultSet();
			
			while (rs.next()) {
				TrabajadorProyecto objTrab = new TrabajadorProyecto();
				objTrab.setCodTrabajador(rs.getInt("CODTRABAJADOR"));
				objTrab.setNombre(rs.getString("NOMBRE"));
				objTrab.setApePat(rs.getString("APEPAT"));
				objTrab.setApeMat(rs.getString("APEMAT"));
				objTrab.setEdad(rs.getInt("EDAD"));
				objTrab.setNroDoc(rs.getString("NRODOC"));
				objTrab.setEspecialidad(rs.getString("ESPECIALIDAD"));
				objTrab.setPerfil(rs.getInt("PERFIL"));
				objTrab.setEstado(rs.getInt("ESTADO"));
				objTrab.setRazSoc(rs.getString("razonsocial"));
				objTrab.setRuc(rs.getString("Co_Cliente"));
				objTrab.setDescProyecto(rs.getString("De_proyecto"));
				list.add(objTrab);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		return list;
	}

	@Override
	public List<Perfil> consultarPerfil() throws Exception {
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
			throw e;
		}
		return list;
	}

	@Override
	public List<Trabajador> consultarTrabajadorxFecha(String fec_in, String fec_fin, int perfil, int estado) throws Exception {
		Connection cn = MySqlConexion.obtenerConexion();
		List<Trabajador> list = new ArrayList<Trabajador>();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("SELECT rec.* FROM recurso rec " + 
				" left join reserva rs on rec.codtrabajador = rs.co_trabajador " +
				" where rec.estado = ? and rec.perfil = ? " +
				((fec_in != null && fec_fin != null &&
						!fec_in.equals("") && !fec_fin.equals("")) ?  
					" and ? not between rs.fe_inicio and rs.fe_fin " +
					" and ? not between rs.fe_inicio and rs.fe_fin " +
					" or (rs.fe_inicio is null and rs.fe_fin is null);" : ";"));
			
			pStmt.setInt(1, estado);
			pStmt.setInt(2, perfil);
			if (fec_in != null && fec_fin != null &&
					!fec_in.equals("") && !fec_fin.equals("")){
				pStmt.setString(3, fec_fin);
				pStmt.setString(4, fec_in);
			}
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
			throw e;
		}
		return list;
	}

	@Override
	public void actualizarTrabajador(Trabajador trabajador) throws Exception {
		Connection cn = MySqlConexion.obtenerConexion();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("Update recurso Set" +
				" nombre = ?, apepat = ? , apemat = ?, edad = ?, nrodoc = ?, especialidad = ?, estado = ?" +
				" where codtrabajador = ?;");
			pStmt.setString(1, trabajador.getNombre());
			pStmt.setString(2, trabajador.getApePat());
			pStmt.setString(3, trabajador.getApeMat());
			pStmt.setInt(4, trabajador.getEdad());
			pStmt.setString(5, trabajador.getNroDoc());
			pStmt.setString(6, trabajador.getEspecialidad());
			pStmt.setInt(7, trabajador.getEstado());
			pStmt.setInt(8, trabajador.getCodTrabajador());
			
			pStmt.executeUpdate();

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public Trabajador crearTrabajador(Trabajador trabajador) throws Exception {
		Connection cn = MySqlConexion.obtenerConexion();
		try
		{
			PreparedStatement pStmt = cn.prepareStatement("Insert into recurso (nombre,apepat,apemat,edad,nrodoc,especialidad,estado, perfil)" +
				" values (?, ?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
			pStmt.setString(1, trabajador.getNombre());
			pStmt.setString(2, trabajador.getApePat());
			pStmt.setString(3, trabajador.getApeMat());
			pStmt.setInt(4, trabajador.getEdad());
			pStmt.setString(5, trabajador.getNroDoc());
			pStmt.setString(6, trabajador.getEspecialidad());
			pStmt.setInt(7, trabajador.getEstado());
			pStmt.setInt(8, trabajador.getPerfil());
			
			pStmt.executeUpdate();
			
			ResultSet rs = pStmt.getGeneratedKeys();
			
			while (rs.next()) {
				trabajador.setCodTrabajador(rs.getInt(1));
			}
			cn.close();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		return trabajador;
	}

}
