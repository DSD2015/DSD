app.controller('PerfilController', function($scope, $http) {
    // Default values
    $scope.perfiles = [];
    $scope.perfil = 1;

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",

        reqPerfil = {
            method: "GET",
            url: urlBasePath + "trabajador/perfil"
        };

    // Get default list
    $http(reqPerfil).success(function(response){
        $scope.perfiles = response;
    }).error(function(response){
        console.error("Se produjo un error");
    });
});