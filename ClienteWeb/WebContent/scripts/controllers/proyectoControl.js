app.controller('ProyectoController', function($scope, $http) {
    // Default values
    $scope.ruc = "";
    $scope.nroDoc = "";
    $scope.trabajadores = [];

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",
        reqTrabProy = {
            method: "GET",
            url: urlBasePath + "trabajador/proyecto",
            params: {
                dni: $scope.nroDoc,
                ruc: $scope.ruc
            }
        };

    // Get default list
    $http(reqTrabProy).success(function(response){
        $scope.trabajadores = response;
    }).error(function(response){
        console.error("Se produjo un error");
    });

    $scope.buscarTrabxProyecto = function () {
        reqTrabProy.params = {
            dni: $scope.nroDoc,
            ruc: $scope.ruc
        };

        $http(reqTrabProy).success(function(response){
            $scope.trabajadores = response;
        }).error(function(response){
            console.error("Se produjo un error");
        });
    };
});