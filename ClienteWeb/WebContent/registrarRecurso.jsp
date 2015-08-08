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
        <h3>Registrar Trabajador</h3>
        <form role="form">
            <div class="form-group">
                <label for="dni">DNI:</label>
                <input type="text" class="form-control" id="dni" ng-model="trabajador.nroDoc">
            </div>
            <div class="form-group">
                <label for="nombre">Apellido Paterno:</label>
                <input type="text" class="form-control" id="nombre" ng-model="trabajador.apePat">
            </div>
            <div class="form-group">
                <label for="nombre">Apellido Materno:</label>
                <input type="text" class="form-control" id="nombre" ng-model="trabajador.apeMat">
            </div>
            <div class="form-group">
                <label for="nombre">Nombres:</label>
                <input type="text" class="form-control" id="nombre" ng-model="trabajador.nombre">
            </div>
            <div class="form-group">
              <label for="perfil">Perfil:</label>
              <select class="form-control" id="perfil" ng-model="perfil" ng-options="item.idPerfil as item.descripcion for item in perfiles">
              </select>
            </div>
            <div class="form-group">
                <label for="nombre">Edad:</label>
                <input type="number" class="form-control" id="nombre" ng-model="trabajador.edad">
            </div>
            <div class="form-group">
                <label for="nombre">Especialidad:</label>
                <input type="text" class="form-control" id="nombre" ng-model="trabajador.especialidad">
            </div>
            <div class="form-group">
                <div class="form-group">
                  <select class="form-control" id="sel1" ng-model="estado" ng-options="item.value as item.label for item in statusList">
                  </select>
                </div>
            </div>
            <div>
                <button type="submit" class="btn btn-primary" id="actualizar" ng-click="registrar()">Registrar</button>
            </div>
        </form>
    </div>
</body>
</html>