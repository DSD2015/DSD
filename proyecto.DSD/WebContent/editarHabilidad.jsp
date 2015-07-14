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
		<form role="form" action="actualizarHabilidad.jsp">
			<div class="form-group">
				<label for="ruc">Ruc:</label>
				<input type="number" class="form-control" id="ruc" value="123456">
			</div>
			<div class="form-group">
				<label for="razSoc">Razón Social:</label>
				<input type="text" class="form-control" id="razSoc" value="Sunat">
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
				<button type="submit" class="btn btn-primary">Actualizar</button>
			</div>
		</form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>