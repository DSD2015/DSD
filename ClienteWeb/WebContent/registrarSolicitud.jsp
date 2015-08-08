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
    <div class="container">
        <h3>Registrar Solicitud</h3>
        <form action="ServletSoli" name="solicitud" method="post" role="form">
            <input  type="hidden" name="met" value="registrar"  >
            <div class="form-group">
                <label for="selecCliente">Cliente:</label>
                <select class="form-control" name="selecCliente" id="selecCliente" >
                    <%  for(Cliente cli  :listarCliente){  %>
                    <option  value="<%=cli.getCodcliete() %> "  ><%=cli.getRazonsocial() %>  </option>
                    <% } %>
                </select>
            </div>
            <div class="form-group">
                <label for="txtdesperfil">Descripción Perfil:</label>
                <input type="text" class="form-control" name="txtdesperfil" id="txtdesperfil" value="" >
            </div>
            <div class="form-group">
                <label for="txtdesproy">Descripción Proyecto:</label>
                <input type="text" class="form-control" name="txtdesproy" id="txtdesproy" value="" >
            </div>
            <div class="form-group">
                <label for="txtfecinicio">Fecha Inicio:</label>
                <input type="text" class="form-control" name="txtfecinicio" id="txtfecinicio" value="" >
            </div>
            <div class="form-group">
                <label for="txtfecfin">Fecha Fin:</label>
                <input type="text" class="form-control" name="txtfecfin" id="txtfecfin" value="" >
            </div>
            <div>
                <a href="#" onclick="javascript:f_registrar();"  > Registrar</a>
            </div>
        </form>
    </div>
</body>
</html>