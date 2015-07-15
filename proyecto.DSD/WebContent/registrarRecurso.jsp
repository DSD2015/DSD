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
	<div class="container">
		<h4>Registrar Recurso</h4>
		<form role="form" action="actualizarTrabajador.jsp">
			<div class="form-group">
				<label for="dni">DNI:</label>
				<input type="number" class="form-control" id="dni">
			</div>
			<div class="form-group">
				<label for="nombre">Nombres y Apellidos Trab.:</label>
				<input type="text" class="form-control" id="nombre">
			</div>
			<div class="form-group">
				<label for="estado">Estado:</label>
				<div class="radio">
					<label><input name="estado" type="radio"> Activo</label>
					<label><input name="estado" type="radio"> Inactivo</label>
				</div>
			</div>
			<div>
				<button type="submit" class="btn btn-default">Regresar</button>
				<button type="submit" class="btn btn-primary" id="actualizar">Actualizar</button>
			</div>
		</form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>
