<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUtilServiceImplProxyid" scope="session" class="serviceImpl.UtilServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUtilServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUtilServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUtilServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        serviceImpl.UtilServiceImpl getUtilServiceImpl10mtemp = sampleUtilServiceImplProxyid.getUtilServiceImpl();
if(getUtilServiceImpl10mtemp == null){
%>
<%=getUtilServiceImpl10mtemp %>
<%
}else{
        if(getUtilServiceImpl10mtemp!= null){
        String tempreturnp11 = getUtilServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String codcli_2id=  request.getParameter("codcli18");
            java.lang.Integer codcli_2idTemp = null;
        if(!codcli_2id.equals("")){
         codcli_2idTemp  = java.lang.Integer.valueOf(codcli_2id);
        }
        String feInicio_3id=  request.getParameter("feInicio20");
            java.util.Calendar feInicio_3idTemp = null;
        if(!feInicio_3id.equals("")){
        java.text.DateFormat dateFormatfeInicio20 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfeInicio20  = dateFormatfeInicio20.parse(feInicio_3id);
         feInicio_3idTemp = new java.util.GregorianCalendar();
        feInicio_3idTemp.setTime(dateTempfeInicio20);
        }
        String desperfil_4id=  request.getParameter("desperfil22");
            java.lang.String desperfil_4idTemp = null;
        if(!desperfil_4id.equals("")){
         desperfil_4idTemp  = desperfil_4id;
        }
        String desproyecto_5id=  request.getParameter("desproyecto24");
            java.lang.String desproyecto_5idTemp = null;
        if(!desproyecto_5id.equals("")){
         desproyecto_5idTemp  = desproyecto_5id;
        }
        String fecCreacion_6id=  request.getParameter("fecCreacion26");
            java.util.Calendar fecCreacion_6idTemp = null;
        if(!fecCreacion_6id.equals("")){
        java.text.DateFormat dateFormatfecCreacion26 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfecCreacion26  = dateFormatfecCreacion26.parse(fecCreacion_6id);
         fecCreacion_6idTemp = new java.util.GregorianCalendar();
        fecCreacion_6idTemp.setTime(dateTempfecCreacion26);
        }
        String codsolicitud_7id=  request.getParameter("codsolicitud28");
            java.lang.Integer codsolicitud_7idTemp = null;
        if(!codsolicitud_7id.equals("")){
         codsolicitud_7idTemp  = java.lang.Integer.valueOf(codsolicitud_7id);
        }
        String feFin_8id=  request.getParameter("feFin30");
            java.util.Calendar feFin_8idTemp = null;
        if(!feFin_8id.equals("")){
        java.text.DateFormat dateFormatfeFin30 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfeFin30  = dateFormatfeFin30.parse(feFin_8id);
         feFin_8idTemp = new java.util.GregorianCalendar();
        feFin_8idTemp.setTime(dateTempfeFin30);
        }
        String estsolicitud_9id=  request.getParameter("estsolicitud32");
            java.lang.String estsolicitud_9idTemp = null;
        if(!estsolicitud_9id.equals("")){
         estsolicitud_9idTemp  = estsolicitud_9id;
        }
        %>
        <jsp:useBean id="serviceImpl1Solicitud_1id" scope="session" class="serviceImpl.Solicitud" />
        <%
        serviceImpl1Solicitud_1id.setCodcli(codcli_2idTemp);
        serviceImpl1Solicitud_1id.setFeInicio(feInicio_3idTemp);
        serviceImpl1Solicitud_1id.setDesperfil(desperfil_4idTemp);
        serviceImpl1Solicitud_1id.setDesproyecto(desproyecto_5idTemp);
        serviceImpl1Solicitud_1id.setFecCreacion(fecCreacion_6idTemp);
        serviceImpl1Solicitud_1id.setCodsolicitud(codsolicitud_7idTemp);
        serviceImpl1Solicitud_1id.setFeFin(feFin_8idTemp);
        serviceImpl1Solicitud_1id.setEstsolicitud(estsolicitud_9idTemp);
        java.lang.Integer registrarSolicitud13mtemp = sampleUtilServiceImplProxyid.registrarSolicitud(serviceImpl1Solicitud_1id);
if(registrarSolicitud13mtemp == null){
%>
<%=registrarSolicitud13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registrarSolicitud13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 34:
        gotMethod = true;
        serviceImpl.Cliente[] listarClientes34mtemp = sampleUtilServiceImplProxyid.listarClientes();
if(listarClientes34mtemp == null){
%>
<%=listarClientes34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(listarClientes34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(listarClientes34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>