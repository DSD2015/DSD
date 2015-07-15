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
        <div class="row">
            <div class="col-lg-12">
                <label>Consultar Recurso por Estado:</label>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="DNI">
                </div>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
				  <select class="form-control" id="sel1">
				    <option>Activo</option>
				    <option>Inactivo</option>
				  </select>
				</div>
            </div>
            <div class="col-lg-12">
                <button type="submit" class="btn btn-primary">Buscar</button>
            </div>
        </div>
        <div class="row margin-top-medium">
            <table class="table">
                <tr>
                    <th>DNI</th>
                    <th>Nombres y Apellidos</th>
                    <th>Estado</th>
                </tr>
                <tr>
                    <td>123456</td>
                    <td>Alberto Ortega Alvarez</td>
                    <td>Activo</td>
                </tr>
            </table>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>
