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
	<table   border="1" >
		<tr>
			<td>Ruc</td>
			<td>
				<input  type="text" value="123456" >
			</td>
		</tr>
		<tr>
			<td>Razon scial</td>
			<td>
				<input  type="text" value="Sunat" >
			</td>
		</tr>
		<tr>
			<td>Estado</td>
			<td>
				<select>
					<option selected="selected"  >Activo</option>
					<option>Inactivo</option>
				</select>
			</td>
		</tr>
	</table>
	<table   border="1" >
		<tr>
			<td>
				<a href="actualizarHabilidad.jsp" >Regresar</a>
			</td>
		</tr>
	</table>
</body>
</html>