package com.upc.dsd.dao;

import com.upc.dsd.interfaces.ReservaDAO;
import com.upc.dsd.interfaces.TrabajadorDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public TrabajadorDAO getTrabajadorDAO() {
		// TODO Auto-generated method stub
		return new MySqlTrabajadorDAO();
	}

	@Override
	public ReservaDAO getReservaDAO() {
		// TODO Auto-generated method stub
		return new MySqlReservaDAO();
	}

}
