app.controller('TrabajadorController', function($scope, $http) {

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

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",
        reqTrabEstado = {
            method: "GET",
            url: urlBasePath + "trabajador/estado",
            params: {
                dni: $scope.nroDoc,
                estado: $scope.estado
            }
        };

    // Get default list
    $http(reqTrabEstado).success(function(response){
        $scope.trabajadores = response;
    }).error(function(response){
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
});