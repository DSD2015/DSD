<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
	<%@include file="headfile.jsp" %>
    <script defer src="vendor/angular/angular.min.js"></script>
    <script defer src="vendor/angular/angular-route.min.js"></script>
    <script defer src="scripts/app.js"></script>
    <script defer src="scripts/controllers/proyectoControl.js"></script>
</head>
<body ng-app="DsdApp">
	<%@include file="menu.jsp" %>
	<div class="container" ng-controller="ProyectoController">
        <h3>Consultar Trabajador por Proyecto</h3>
        <div class="row">
            <div class="col-lg-12">
                <label>Consultar Trabajador por Proyecto:</label>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="DNI del Trabajador" ng-model="nroDoc">
                </div>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Ruc de la Empresa" ng-model="ruc">
                </div>
            </div>
            <div class="col-lg-12">
                <button type="submit" class="btn btn-primary" ng-click="buscarTrabxProyecto()">Buscar</button>
            </div>
        </div>

        <div class="row margin-top-medium">
            <table class="table">
                <tr>
                    <th>DNI</th>
                    <th>Nombres y Apellidos</th>
                    <th>Proyecto</th>
                    <th>Razón Social</th>
                    <th>Ruc</th>
                </tr>
                <tr ng-repeat="tra in trabajadores">
                    <td>{{ tra.nroDoc }}</td>
                    <td>{{ tra.apePat + " " + tra.apeMat + ", " + tra.nombre}}</td>
                    <td>{{ tra.descProyecto }}</td>
                    <td>{{ tra.razSoc }}</td>
                    <td>{{ tra.ruc }}</td>
                </tr>
            </table>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>