<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
			<td>Consultar Trabajador x Estado</td>
		</tr>
		<tr>
			<td>DNI</td>
			<td>
				<input type="text" value="" >
			</td>
			<td></td>
		<tr>
			<td>Estado</td>
			<td>
				<select>
					<option>Activo</option>
					<option>Inactivo</option>
				</select>
			</td>
			<td>
				<a href="consultarTrabajadorxEstado.jsp" >Buscar</a>
			</td>
		</tr>
	</table>
	<table  border="1" >
		<tr>
			<td>DNI</td>
			<td>Nombres y Apellidos Trab.</td>
			<td>Estado</td>
		</tr>
		<tr>
			<td>123456</td>
			<td>Alberto Ortega Alvarez</td>
			<td>Activo  </td>
		</tr>
	</table>
</body>
</html>