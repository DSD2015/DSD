package com.upc.dsd.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.WordUtils;

import com.upc.dsd.util.MySqlConexion;

import org.apache.commons.codec.binary.Base64;

public class MySqlClienteDAO{

	/*@Override
	public List<Cliente> clientesPorOficial(Oficial oficial) {
		// TODO Auto-generated method stub
		Connection cn = MySqlConexion.obtenerConexion();
		List<Cliente> list = new ArrayList<Cliente>();
		try
		{
			CallableStatement cStmt = cn.prepareCall("{CALL spr_clientes_x_oficial(?)}");
			
			cStmt.setInt(1, oficial.getId());
			cStmt.execute();
			
			ResultSet rs = cStmt.getResultSet();
			
			while (rs.next()) {
				Date date_of_birth = new Date(rs.getDate("fecha_nac").getTime());
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				String fecha = formatter.format(date_of_birth);
				Cliente objCli = new Cliente();
				objCli.setId(rs.getInt("customer_id"));
				objCli.setNivel(rs.getInt("customer_level_id"));
				objCli.setNombre(capitalize(rs.getString("display_name")));
				objCli.setPadre_id(rs.getInt("parent_customer_id"));
				objCli.setOficial_id(oficial.getId());
				objCli.setDate_of_birth(fecha);
				objCli.setGovernment_id( rs.getString("government_id"));
				objCli.setGroup_name(capitalize(rs.getString("group_name")));
				objCli.setTotal_ahorro(rs.getDouble("total_ahorro"));
				objCli.setDeuda_total(rs.getDouble("deuda_total"));
				objCli.setCreditos_activos(rs.getInt("creditos_activos"));
				objCli.setLast_loan_disbursed(rs.getInt("last_loan_disbursed"));
				objCli.setContent_type(rs.getString("content_type"));
				objCli.setPath(rs.getString("path"));
				objCli.setCart_riesgo(rs.getDouble("cart_riesgo"));
				objCli.setSolo_nombre(capitalize(rs.getString("nombre")));
				objCli.setApellidos(capitalize(rs.getString("apellidos")));
				objCli.setDireccion(capitalize(rs.getString("direccion")));
				objCli.setCiudad(capitalize(rs.getString("ciudad")));
				objCli.setEstado(capitalize(rs.getString("estado")));
				objCli.setPais(capitalize(rs.getString("pais")));
				objCli.setCodigo_postal(rs.getString("codigo_postal"));
				objCli.setNombre_respaldo(capitalize(rs.getString("nombre_respaldo")));
				objCli.setApellidos_respaldo(capitalize(rs.getString("apellidos_respaldo")));
				int parent_id = rs.getInt("name_type");
				switch(parent_id){
				case 1 :
					objCli.setParentesco("Esposo");
					break;
				case 2 :
					objCli.setParentesco("Padre");
					break;
				default:
					objCli.setParentesco("");
					break;
				}
				
				try{
					File imagen = new File(System.getenv("MIFOS_CONF")+
							"/imageStore/"+objCli.getPath());
					
					FileInputStream fis = new FileInputStream(imagen);
					byte[] b = new byte[fis.available()];
					fis.read(b);
					String encode = Base64.encodeBase64String(b);
					objCli.setImagen(encode);
					fis.close();
				}catch(Exception e){
				}
				list.add(objCli);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Cliente> gruposPorOficial(Oficial oficial) {
		// TODO Auto-generated method stub
		Connection cn = MySqlConexion.obtenerConexion();
		List<Cliente> list = new ArrayList<Cliente>();
		try
		{
			CallableStatement cStmt = cn.prepareCall("{CALL spr_grupos_x_oficial(?)}");
			
			cStmt.setInt(1, oficial.getId());
			cStmt.execute();
			
			ResultSet rs = cStmt.getResultSet();
			
			while (rs.next()) {
				Date date_of_birth = new Date();
				Cliente objCust = new Cliente();
				objCust.setId(rs.getInt("customer_id"));
				objCust.setNivel(rs.getInt("customer_level_id"));
				objCust.setNombre(capitalize(rs.getString("display_name")));
				objCust.setPadre_id(rs.getInt("parent_customer_id"));
				objCust.setOficial_id(oficial.getId());
				objCust.setDate_of_birth(date_of_birth.toString());
				objCust.setGovernment_id("");
				objCust.setGroup_name("");
				objCust.setCart_riesgo(rs.getDouble("cart_riesgo"));
				list.add(objCust);
			}

			cn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	private String capitalize(String line){
		line = WordUtils.capitalize(line.toLowerCase()).replace("-","");
		return line;
	}*/
}
