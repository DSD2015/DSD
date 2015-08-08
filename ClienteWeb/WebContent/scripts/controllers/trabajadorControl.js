app.controller('TrabajadorController', function($scope, $http, $location) {

    $scope.statusList = [
        {
            value: 1,
            label: "Activo"
        },
        {
            value: 0,
            label: "Inactivo"
        }
    ];

    // Default values
    $scope.estado = 1;
    $scope.nroDoc = "";
    $scope.trabajadores = [];
    $scope.consulta = true;
    $scope.perfil = 1;
    $scope.perfiles = [];

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",
        reqTrabEstado = {
            method: "GET",
            url: urlBasePath + "trabajador/estado",
            params: {
                dni: $scope.nroDoc,
                estado: $scope.estado
            }
        },
        reqTrabAct = {
            method: "POST",
            url: urlBasePath + "trabajador/actualizar"
        },
        reqTrabReg = {
            method: "POST",
            url: urlBasePath + "trabajador/crear"
        },
        reqPerfil = {
            method: "GET",
            url: urlBasePath + "trabajador/perfil"
        };

    // Get default list
    $http(reqTrabEstado).success(function(response){
        $scope.trabajadores = response;
    }).error(function(response){
        console.error("Se produjo un error");
    });
    $http(reqPerfil).success(function(response){
        $scope.perfiles = response;
    }).error(function(){
        console.error("Se produjo un error");
    });

    $scope.buscarTrabxEstado = function () {
        reqTrabEstado.params = {
            dni: $scope.nroDoc,
            estado: $scope.estado
        };

        $http(reqTrabEstado).success(function(response){
            $scope.trabajadores = response;
        }).error(function(response){
            console.error("Se produjo un error");
        });
    };

    $scope.irEditar = function (trabajador){
        $scope.consulta = false;
        $scope.trabajador = trabajador;
    }

    $scope.regresar = function () {
        $scope.consulta = true;
    }
    $scope.actualizar = function () {
        if ($scope.trabajador && $scope.trabajador.nroDoc) {
            reqTrabAct.data = $scope.trabajador;
            $http(reqTrabAct).success(function(response){
                alert("Se actualizó el trabajador");
                $http(reqTrabEstado).success(function(response){
                    $scope.trabajadores = response;
                    $scope.regresar();
                }).error(function(response){
                    console.error("Se produjo un error");
                });
            }).error(function(){
                console.error("Se produjo un error");
            });
        } else {
            alert("Ingrese campos requeridos");
        }
    }
    $scope.registrar = function () {
        if ($scope.trabajador && $scope.trabajador.nroDoc) {
            $scope.trabajador.perfil = $scope.perfil;
            $scope.trabajador.estado = $scope.estado;
            reqTrabReg.data = $scope.trabajador;
            $http(reqTrabReg).success(function(response){
                alert("Se creo el trabajador con el código: "+ response.codTrabajador);
                $http(reqTrabEstado).success(function(response){
                    $scope.trabajadores = response;
                    $scope.regresar();
                }).error(function(response){
                    console.error("Se produjo un error");
                });
            }).error(function(){
                console.error("Se produjo un error");
            });
        } else {
            alert("Ingrese campos requeridos");
        }
    }
});