<div class="container" ng-controller="PerfilController">
    <h3>Buscar Trabajadores disponibles</h3>
    <div class="row">
        <div class="col-lg-4">
            <div class="form-group">
              <label for="perfil">Perfil:</label>
              <select class="form-control" id="perfil" ng-model="perfil" ng-options="item.idPerfil as item.descripcion for item in perfiles">
              </select>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
              <label for="estado">Estado:</label>
              <select class="form-control" id="estado" ng-model="estado">
                <option value="1">Activo</option>
                <option value="0">Inactivo</option>
              </select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">
            <label for="estado">Fecha Inicio:</label>
            <div class='input-group date'>
                <input type='text' class="form-control" placeholder="YYYY-MM-DD" ng-model="fec_in"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
        <div class="col-lg-4">
            <label for="estado">Fecha Fin:</label>
            <div class='input-group date'>
                <input type='text' class="form-control" placeholder="YYYY-MM-DD" ng-model="fec_fin"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <button type="submit" class="btn btn-primary" ng-click="buscarTrab()">Buscar</button>
        </div>
    </div>
    <div class="row margin-top-medium">
        <div class="col-lg-8">
            <table class="table">
                <tr>
                    <th>DNI</th>
                    <th>Nombres y Apellidos</th>
                    <th>Edad</th>
                    <th>Estado</th>
                    <th>Seleccionar</th>
                </tr>
                <tr ng-repeat="tra in trabajadores">
                    <td>{{ tra.nroDoc }}</td>
                    <td>{{ tra.apePat + " " + tra.apeMat + ", " + tra.nombre}}</td>
                    <td>{{ tra.edad }}</td>
                    <td>{{ tra.estado ? "Activo" : "Inactivo" }}</td>
                    <td><input type="radio" name="seleccinar" ng-value="{{tra}}" ng-model="$parent.trabSelected"></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <button  type="button" data-dismiss="modal" class="btn btn-primary" ng-click="seleccionar()">Seleccionar</button>
        </div>
    </div>
</div>