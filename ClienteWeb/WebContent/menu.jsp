<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="registrarRecurso.jsp">Registrar Trabajador</a></li>
                <li><a href="actualizarTrabajador.jsp">Actualizar Trabajador</a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Consultar Trabajador <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="consultarTrabajadorxEstado.jsp">Por Estado</a></li>
                        <li><a href="consultarTrabajadorProy.jsp">Por Proyecto</a></li>
                    </ul>
                </li>
                <li><a href="reservaRecursos.jsp">Reserva de Recursos</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.jsp">Cerrar Sesión</a></li>
            </ul>
        </div>
    </div>
</nav>