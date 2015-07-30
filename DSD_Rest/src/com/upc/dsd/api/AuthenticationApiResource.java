package com.upc.dsd.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.upc.dsd.params.LoginParameters;

/**
 * Clase de Servicio encargada del Logeo de Usuario
 * 
 * @author Enrique IV
 * 
 */
//@Path("/authentication")
public class AuthenticationApiResource {

	/**
	 * Autentifica el usuario a logearse
	 * 
	 * @param user
	 * @param pass
	 * @return
	 *
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public Authentication login(@QueryParam("username") final String user,
			@QueryParam("password") final String pass) {

		// System.out.println("authentication init");

		LoginParameters params = new LoginParameters();
		params.setUser(user);
		params.setPassword(pass);

		Authentication aut = LoginBL.LogIn(params);

		return aut;
	}*/
}