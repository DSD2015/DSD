<%@page import="java.util.ArrayList"%>
<%@page import="utilserviceImple.UtilServiceImple.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quick Win</title>
    <%@include file="headfile.jsp" %>
    <script>
        function f_registrar(){
            alert("ingresooo");

            var selecCliente = document.solicitud.selecCliente.value;
            var txtdesperfil = document.solicitud.txtdesperfil.value;
            var txtdesproy   = document.solicitud.txtdesproy.value;
            var txtfecinicio = document.solicitud.txtfecinicio.value;
            var txtfecfin    = document.solicitud.txtfecfin.value;

            document.solicitud.met.value='registrar';
            document.solicitud.action='ServletSoli?met=registrar'
                    +'&selecCliente='+selecCliente
                    +'&txtdesperfil='+txtdesperfil
                    +'&txtdesproy='+txtdesproy
                    +'&txtfecinicio='+txtfecinicio
                    +'&txtfecfin='+txtfecfin;

            document.solicitud.submit();
        }
    </script>
    <%
        ArrayList<Cliente>   listarCliente = null;
        try{
                listarCliente = (ArrayList<Cliente>)request.getSession().getAttribute("lista");
        }catch(Exception e){
            System.out.println("e : "+ e );
        }
    %>
</head>
<body>
    <%@include file="menu2.jsp" %>
    <form action="ServletSoli" name="solicitud" method="post" >
    <input  type="hidden" name="met" value="registrar"  >
    <table  align="center" >
            <tr>
                <td></td>
                <td> Registrar Solicitud</td>
            </tr>
            <tr>
                <td>Cliente</td>
                <td>
                    <select  name="selecCliente" id="selecCliente" >
                    <%  for(Cliente cli  :listarCliente){  %>
                    <option  value="<%=cli.getCodcliete() %> "  ><%=cli.getRazonsocial() %>  </option>
                    <% } %>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Descripcion Perfil</td>
                <td>
                    <input type="text"  name="txtdesperfil" id="txtdesperfil" value="" >
                </td>
            </tr>
            <tr>
                <td>Descripcion Proyecto</td>
                <td>
                    <input type="text"  name="txtdesproy"   id="txtdesproy" value="" >
                </td>
            </tr>
            <tr>
                <td>Fecha Inicio</td>
                <td>
                    <input type="text"  name="txtfecinicio" id="txtfecinicio"  value="" >
                </td>
            </tr>
            <tr>
                <td>Fecha Fin</td>
                <td>
                    <input type="text"  name="txtfecfin"  id="txtfecfin" value="" >
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <a href="#" onclick="javascript:f_registrar();"  > Registrar</a>
                </td>
            </tr>
    </table>
    </form>
</body>
</html>