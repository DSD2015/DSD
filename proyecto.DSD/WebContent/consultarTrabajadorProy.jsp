<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
	<%@include file="headfile.jsp" %>
</head>
<body style="background:#999999">
	<%@include file="menu.jsp" %>
	<table   >
		<tr>
			<td></td>
			<td>Consultar Trabajador x Proyecto</td>
		</tr>
		<tr>
			<td>DNI</td>
			<td>
				<input type="text" value="">
			</td>
			<td></td>
		</tr>
		<tr>
			<td>RUC</td>
			<td> <input type="text" value="">
			</td>
			<td>
				<a href="consultarTrabajadorProy.jsp">Buscar</a>
			</td>
		</tr>
	</table>
	<table   border="1" >
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