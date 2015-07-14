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
			<td></td>
			<td> Buscar Recursos</td>
		</tr>
		<tr>
			<td> Perfil </td>
			<td>
				<select>
				<option>seleccione</option>
				<option>Analista</option>
				</select>
			</td>
			<td></td>
		</tr>
		<tr>
			<td> Estado </td>
			<td>
				<select>
					<option>Pendiente</option>
					<option>No pendiente</option>
				</select>
			</td>
			<td> <a  href="actualizarHabilidad.jsp" >Buscar</a>    </td>
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
			<td>  </td>   <td> <input  type="button" value="Buscar" >	  </td>   <td>     </td>
		</tr>
	</table>
	<table   border="1" >
		<tr>
			<td>Nombre</td>
			<td>Sexo</td>
			<td>Edad</td>
			<td>Distrito</td>
			<td>Seleccionar  </td>
		</tr>
		<tr>
			<td>Sandra Wilcox </td>
			<td>Femenino </td>
			<td>23  </td>
			<td>Lima</td>
		</tr>
		<tr>
			<td>Yenny Chavez </td>
			<td>Femenino </td>
			<td>25  </td>
			<td>  San Miguel  </td>
		</tr>
		<tr>
			<td> Carmen Rojas </td>
			<td>Femenino </td>
			<td>26  </td>
			<td>San Isidro</td>
		</tr>
	</table>
</body>
</html>