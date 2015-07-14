<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quick Win</title>
    <%@include file="headfile.jsp" %>
</head>
<body>
    <%@include file="menu.jsp" %>
    <table >
        <tr>
            <td></td>
            <td>Buscar Habilidad x Proyecto</td>
        </tr>
        <tr>
            <td>Ruc</td>
            <td>
                <input type="text" value="">
            </td>
            <td>
                <a href="actualizarHabilidad.jsp">Buscar</a>
            </td>
        </tr>
    </table>
    <table border="1" >
        <tr>
            <td>Ruc</td>
            <td>Razon social</td>
            <td>Estado</td>
            <td>Editar</td>
        </tr>
        <tr>
            <td>123456</td>
            <td>Sunat</td>
            <td>Activo</td>
            <td>
                <a href="editarTrabajador.jsp">Actualizar</a>
            </td>
        </tr>
    </table>
</body>
</html>