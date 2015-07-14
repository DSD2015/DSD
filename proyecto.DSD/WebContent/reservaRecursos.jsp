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
	<table>
		<tr>
		<td></td>   <td> Reservar Recurso	  </td>
		</tr>
		<tr>
		<td>Buscar Recurso</td>   <td> <a  href="modalBuscarRecurso.jsp" > Ingresar</a>	  </td>   <td>     </td>
		</tr>
		<tr>
		<td>Solicitud</td>   <td> <input  type="text" value="S0001" >	  </td>   <td>     </td>
		</tr>
		<tr>
		<td>Recurso</td>   <td> <input  type="text" value="Alberto Ortega" >	  </td>   <td>     </td>
		</tr>
		<tr>
		<td>Cantidad Horas</td>   <td> <input  type="text" value="" >	  </td>   <td>     </td>
		</tr>
		<tr>
		<td> Fecha Inicio </td>
		<td> <input  type="button" value=".........." >	  </td>   <td>     </td>
		</tr>
		<tr>
		<td> Fecha Fin </td>
		<td> <input  type="button" value=".........." >	  </td>   <td>     </td>
		</tr>
		<tr>
		<td>Detalle</td>   <td> <textarea rows="" cols=""></textarea>	  </td>   <td>     </td>
		</tr>
		<tr>
		<td>Perfil</td>   <td> <input  type="text" value="Analista Programador" >	  </td>   <td>  <a  href="reservaRecursos.jsp" >Generar Reserva</a>   </td>
		</tr>
	</table>
</body>
</html>