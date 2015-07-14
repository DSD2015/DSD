<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
	<%@include file="headfile.jsp" %>
</head>
<body>
	<%@include file="menu.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col-lg-2">
				<span>Buscar Trabajador:</span>
			</div>
			<div class="col-lg-4">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Ruc">
					<span class="input-group-btn">
					<button class="btn btn-primary" type="button">Buscar</button>
					</span>
				</div>
			</div>
		</div>

		<div class="row margin-top-medium">
			<table class="table">
				<tr>
					<th>DNI</th>
					<th>Nombres y Apellidos Trab.</th>
					<th>Estado</th>
					<th>Editar</th>
				</tr>
				<tr>
					<td>123456</td>
					<td>Alberto Ortega Alvarez</td>
					<td>Activo  </td>
					<td>
						<a href="editarTrabajador.jsp" class="glyphicon glyphicon-pencil" aria-hidden="true"></a>
					</td>
				</tr>
			</table>
		</div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>