<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:#999999">

<%@include file="menu.jsp" %>


<table  align="center" >

		<tr>
		<td></td>   <td> Consultar Trabajador x Proyecto	  </td>
		</tr>
		
		
		<tr>
		<td>DNI</td>   <td> <input  type="text" value="" >	  </td>   <td>    </td>
		
		<tr>
		<td>RUC</td>   <td> <input  type="text" value="" >	  </td>   <td> <a  href="consultarTrabajadorProy.jsp" >Buscar</a>    </td>
		</tr>
		</tr>
		


</table>





<table  align="center" border="1" >

		<tr>
		<td>DNI</td>
		<td>Nombres y Apellidos Trab.</td>
		<td>Proyecto</td>
		<td>Razon social</td>
		<td>Ruc</td>
		</tr>
		
		
		<tr>
		<td>123456</td>  
		<td>Alberto Ortega Alvarez</td>  
		<td>Multi Servicios Sunat  </td>   
		<td>Sunat</td>  
		
		<td>7654321</td>
		
		</tr>
		
		


</table>


</body>
</html>