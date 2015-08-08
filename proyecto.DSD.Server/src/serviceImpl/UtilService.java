package serviceImpl;

import java.util.ArrayList;

import javax.jws.WebService;

import bean.*;


@WebService(name="UtilService")
public interface UtilService {
	
	
	
	public Integer registrarSolicitud(Solicitud solicitud);
	
	public ArrayList<Cliente> listarClientes();
	

}
