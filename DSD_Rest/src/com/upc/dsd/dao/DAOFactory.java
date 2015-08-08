package com.upc.dsd.dao;

import com.upc.dsd.interfaces.ReservaDAO;
import com.upc.dsd.interfaces.TrabajadorDAO;

public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    
    public abstract TrabajadorDAO getTrabajadorDAO();
    public abstract ReservaDAO getReservaDAO();
    public static DAOFactory getDAOFactory(int whichFactory){
       switch(whichFactory){
      	case MYSQL:
       	    return new MySqlDAOFactory();
       	default:
       	    return null;
       }
    }
    
    
}
