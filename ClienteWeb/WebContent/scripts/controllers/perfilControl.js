app.controller('PerfilController', function($scope, $rootScope, $http) {
    // Default values
    $scope.perfiles = [];
    $scope.trabajadores = [];
    $scope.perfil = 1;
    $scope.estado = "1";

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",
        reqPerfil = {
            method: "GET",
            url: urlBasePath + "trabajador/perfil"
        },
        reqTrab = {
            method: "GET",
            url: urlBasePath + "trabajador/fechas",
            params: {
                fec_in: '',
                fec_fin: '',
                perfil: $scope.perfil,
                estado: $scope.estado
            }
        };

    // Get default list
    $http(reqPerfil).success(function(response){
        $scope.perfiles = response;
        $http(reqTrab).success(function(responseT){
            $scope.trabajadores = responseT;
        }).error(function(){
            console.error("Se produjo un error");
        });
    }).error(function(){
        console.error("Se produjo un error");
    });

    $scope.buscarTrab = function () {
        reqTrab.params = {
            fec_in: $scope.fec_in,
            fec_fin: $scope.fec_fin,
            perfil: $scope.perfil,
            estado: $scope.estado
        };

        $http(reqTrab).success(function(responseT){
            $scope.trabajadores = responseT;
        }).error(function(){
            console.error("Se produjo un error");
        });
    }
    $scope.seleccionar = function () {
        $rootScope.$broadcast("TrabSeleccionado", $scope.trabSelected);
    }
});