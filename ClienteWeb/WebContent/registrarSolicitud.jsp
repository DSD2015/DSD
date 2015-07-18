<%@page import="java.util.ArrayList"%>
<%@page import="utilserviceImple.UtilServiceImple.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>


function f_registrar(){
	
	alert("ingresooo");
	
	var selecCliente = document.solicitud.selecCliente.value;
	var txtdesperfil = document.solicitud.txtdesperfil.value;
	var txtdesproy 	 = document.solicitud.txtdesproy.value;
	var txtfecinicio = document.solicitud.txtfecinicio.value;
	var txtfecfin 	 = document.solicitud.txtfecfin.value;
	
	
	document.solicitud.met.value='registrar';
	document.solicitud.action='ServletSoli?met=registrar'
			
			+'&selecCliente='+selecCliente
			+'&txtdesperfil='+txtdesperfil
			+'&txtdesproy='+txtdesproy
			+'&txtfecinicio='+txtfecinicio
			+'&txtfecfin='+txtfecfin;
	
	
	document.solicitud.submit();
}	 


</script>

<%
ArrayList<Cliente>   listarCliente = null;
try{
		listarCliente = (ArrayList<Cliente>)request.getSession().getAttribute("lista");

}catch(Exception e){
	System.out.println("e : "+ e );
}

%>

</head>
<body style="background:#999999">



<%@include file="menu2.jsp" %>


<form action="ServletSoli" name="solicitud" method="post" >

<input  type="hidden" name="met" value="registrar"  >


<table  align="center" >

		<tr>
		<td></td>   <td> Registrar Solicitud	  </td>
		</tr>
		
		
		<tr>
		<td>Cliente</td>   
		
		<td> 
		
		<select  name="selecCliente" id="selecCliente" >
		<%  for(Cliente cli  :listarCliente){  %>
		<option  value="<%=cli.getCodcliete() %> "  ><%=cli.getRazonsocial() %>  </option>
		<% } %>
		</select>  
		
		</td> 
		
		</tr>
		
		<tr>
		<td>Descripcion Perfil</td>   
		
		<td> 
		<input type="text"  name="txtdesperfil" id="txtdesperfil" value="" > 
		</td> 
		</tr>
		
		<tr>
		<td>Descripcion Proyecto</td>   
		<td> 
		<input type="text"  name="txtdesproy"   id="txtdesproy" value="" > 
		</td> 
		</tr>
		
		
		<tr>
		<td>Fecha Inicio</td>   
		<td> 
		<input type="text"  name="txtfecinicio" id="txtfecinicio"  value="" > 
		</td> 
		</tr>
		
		
		<tr>
		<td>Fecha Fin</td>   
		<td> 
		<input type="text"  name="txtfecfin"  id="txtfecfin" value="" > 
		</td> 
		</tr>
		
	
		<tr>
		<td></td>   
		
		<td> 
		<a href="#" onclick="javascript:f_registrar();"  > Registrar</a>
		</td> 
		</tr>
		


</table>



</form>


</body>
</html>