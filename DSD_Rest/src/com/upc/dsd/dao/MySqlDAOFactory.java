package com.upc.dsd.dao;

import com.upc.dsd.interfaces.TrabajadorDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public TrabajadorDAO getTrabajadorDAO() {
		// TODO Auto-generated method stub
		return new MySqlTrabajadorDAO();
	}

}
