<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
    <%@include file="headfile.jsp" %>
</head>
<body>
    <%@include file="menu.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <label>Buscar Habilidad por Proyecto:</label>
            </div>
            <div class="col-lg-4">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Nombre de Proyecto">
                </div>
            </div>
            <div class="col-lg-12">
                <button type="submit" class="btn btn-primary">Buscar</button>
            </div>
        </div>

        <div class="row margin-top-medium">
            <table class="table">
                <tr>
                    <th>Ruc</th>
                    <th>Razón Social</th>
                    <th>Estado</th>
                    <th>Editar</th>
                </tr>
                <tr>
                    <td>123456</td>
                    <td>Sunat</td>
                    <td>Activo</td>
                    <td>
                        <a href="editarHabilidad.jsp" class="glyphicon glyphicon-pencil" aria-hidden="true"></a>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>