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
		<h3>Reserva de Recurso</h3>
		<form role="form" action="reservaRecursos.jsp">
			<div class="form-group">
				<label for="ruc">Buscar Recurso:</label>
				<button type="button" class="btn btn-default glyphicon glyphicon-search" data-toggle="modal" data-target="#buscarRecurso"></button>
			</div>
			<div class="form-group">
				<label for="solic">Solicitud:</label>
				<input type="text" class="form-control" id="solic" value="S0001" disabled>
			</div>
			<div class="form-group">
				<label for="recurso">Recurso:</label>
				<input type="text" class="form-control" id="recurso" value="Alberto Ortega" disabled>
			</div>
			<div class="form-group">
				<label for="horas">Cantidad de Horas:</label>
				<input type="number" class="form-control" id="horas">
			</div>
			<div class="form-group">
				<label for="razSoc">Fecha Inicio:</label>
				<div class='input-group date'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
			</div>
			<div class="form-group">
				<label for="razSoc">Fecha Fin:</label>
				<div class='input-group date'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
			</div>
			<div class="form-group">
				<label for="detalle">Detalle:</label>
				<textarea name="" id="detalle" cols="30" rows="8" class="form-control"></textarea>
			</div>
			<div class="form-group">
				<label for="perfil">Perfil:</label>
				<input type="text" class="form-control" id="perfil" value="Analista Programador">
			</div>
			<div>
				<button type="submit" class="btn btn-primary">General Reserva</button>
			</div>
		</form>
	</div>
	<%@include file="footer.jsp" %>
	<div class="modal fade" tabindex="-1" role="dialog" id="buscarRecurso">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
	          <h4 class="modal-title">Buscar Recurso</h4>
	        </div>
	        <div class="modal-body">
	          <%@include file="modalBuscarRecurso.jsp" %>
	        </div>
	      </div>
	  </div>
	</div>
</body>
</html>