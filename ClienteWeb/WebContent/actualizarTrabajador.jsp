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
        <h3>Actualizar Trabajador</h3>
        <div ng-show="consulta">
            <div class="row">
                <div class="col-lg-12">
                    <label>Buscar Trabajador:</label>
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
                        <th>Editar</th>
                    </tr>
                    <tr ng-repeat="tra in trabajadores">
                        <td>{{ tra.nroDoc }}</td>
                        <td>{{ tra.apePat + " " + tra.apeMat + ", " + tra.nombre}}</td>
                        <td>{{ tra.estado ? "Activo" : "Inactivo" }}</td>
                        <td>
                            <a class="glyphicon glyphicon-pencil" aria-hidden="true" ng-click="irEditar(tra)"></a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <div ng-hide="consulta">
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
                    <label for="nombre">Nombres y Apellidos Trab.:</label>
                    <input type="text" class="form-control" id="nombre" ng-model="trabajador.nombre">
                </div>
                <div class="form-group">
                    <label for="nombre">Edad:</label>
                    <input type="number" class="form-control" id="nombre" ng-model="trabajador.edad">
                </div>
                <div class="form-group">
                    <label for="nombre">Nombres y Apellidos Trab.:</label>
                    <input type="text" class="form-control" id="nombre" ng-model="trabajador.especialidad">
                </div>
                <div class="form-group">
                    <div class="form-group">
                      <select class="form-control" id="sel1" ng-model="trabajador.estado" ng-options="item.value as item.label for item in statusList">
                      </select>
                    </div>
                </div>
                <div>
                    <button type="submit" class="btn btn-default" ng-click="regresar()">Regresar</button>
                    <button type="submit" class="btn btn-primary" id="actualizar" ng-click="actualizar()">Actualizar</button>
                </div>
            </form>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>