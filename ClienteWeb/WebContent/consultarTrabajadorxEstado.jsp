<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quick Win</title>
    <%@include file="headfile.jsp" %>
    <script defer src="vendor/angular/angular.min.js"></script>
    <script defer src="vendor/angular/angular-route.min.js"></script>
    <script defer src="scripts/app.js"></script>
    <script defer src="scripts/controllers/trabajadorControl.js"></script>
</head>
<body ng-app="DsdApp">
    <%@include file="menu.jsp" %>
    <div class="container" ng-controller="TrabajadorController">
        <div class="row">
            <div class="col-lg-12">
                <label>Consultar Trabajador por Estado:</label>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="DNI" ng-model="nroDoc">
                </div>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                  <select class="form-control" id="sel1" ng-model="estado" ng-options="item.value as item.label for item in statusList">
                  </select>
                </div>
            </div>
            <div class="col-lg-12">
                <button type="submit" class="btn btn-primary" ng-click="buscarTrabxEstado()">Buscar</button>
            </div>
        </div>
        <div class="row margin-top-medium">
            <table class="table">
                <tr>
                    <th>DNI</th>
                    <th>Nombres y Apellidos</th>
                    <th>Estado</th>
                </tr>
                <tr ng-repeat="tra in trabajadores">
                    <td>{{ tra.nroDoc }}</td>
                    <td>{{ tra.apePat + " " + tra.apeMat + ", " + tra.nombre}}</td>
                    <td>{{ tra.estado ? "Activo" : "Inactivo" }}</td>
                </tr>
            </table>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>