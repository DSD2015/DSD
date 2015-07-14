<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
	<%@include file="headfile.jsp" %>
</head>
<body>
	<%@include file="menu.jsp" %>
	<table>
		<tr>
			<td></td>
			<td> Registrar Recurso	  </td>
		</tr>
		<tr>
			<td>Ruc</td>
			<td> <input  type="text" value="" >	  </td>   <td> <a  href="actualizarTrabajador.jsp" >Buscar</a>    </td>
		</tr>
	</table>
	<table border="1" >
		<tr>
			<td>DNI</td>
			<td>Nombres y Apellidos Trab.</td>
			<td>Estado</td>
			<td>Editar</td>
		</tr>
		<tr>
			<td>123456</td>
			<td>Alberto Ortega Alvarez</td>
			<td>Activo  </td>
			<td>  <a  href="editarTrabajador.jsp" >Actualizar</a>  </td>
		</tr>
	</table>
</body>
</html>