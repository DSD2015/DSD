app.controller('ReservaController', function($scope, $http) {
    $scope.trabajador = "";

    var urlBasePath = "http://localhost:8081/DSD_Rest/rest/",
        reqReserva = {
            method: "POST",
            url: urlBasePath + "reserva/crear"
        };

    $scope.$on("TrabSeleccionado", function (event, trab) {
        $scope.trabajador = trab;
        $scope.trabajador.fullName = $scope.trabajador.apePat + " " + $scope.trabajador.apeMat + ", " + $scope.trabajador.nombre;
    });

    $scope.generarReserva = function () {
        if ($scope.solicitud && $scope.trabajador) {
            reqReserva.data = {
                co_solicitud: $scope.solicitud,
                co_perfil: $scope.trabajador.perfil,
                de_perfil: $scope.trabajador.especialidad,
                cn_perfil: $scope.cn_perfil,
                co_trabajador: $scope.trabajador.codTrabajador,
                es_reserva: 1,
                fe_inicio: $scope.fec_in,
                fe_fin: $scope.fec_fin,
                fe_creacion: $scope.fec_in
            };

            $http(reqReserva).success(function(response){
                $scope.reserva = response;
                alert("Se creo la Reserva con código: "+response.co_reserva);
            }).error(function(){
                console.error("Se produjo un error");
            });
        } else {
            alert("Ingrese datos requeridos");
        }
    }
});